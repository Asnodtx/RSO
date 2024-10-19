package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "pregunta")
public class PreguntaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pregunta_seq")
  @SequenceGenerator(name = "pregunta_seq", sequenceName = "pregunta_seq", allocationSize = 1)
  @Column(name = "idp")
  private Long id;

  @Column(name = "descripcion")
  private String descripcion;

  @OneToMany(mappedBy = "pregunta")
  private Set<FormularioModel> formularios;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Set<FormularioModel> getFormularios() {
    return formularios;
  }

  public void setFormularios(Set<FormularioModel> formularios) {
    this.formularios = formularios;
  }
}
