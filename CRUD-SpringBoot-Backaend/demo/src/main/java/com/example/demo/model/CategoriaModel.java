package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class CategoriaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_seq")
  @SequenceGenerator(name = "categoria_seq", sequenceName = "categoria_seq", allocationSize = 1)
  @Column(name = "idc")
  private Long id;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "valoracion")
  private String valoracion;

  @OneToMany(mappedBy = "categoria")
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

  public String getValoracion() {
    return valoracion;
  }

  public void setValoracion(String valoracion) {
    this.valoracion = valoracion;
  }

  public Set<FormularioModel> getFormularios() {
    return formularios;
  }

  public void setFormularios(Set<FormularioModel> formularios) {
    this.formularios = formularios;
  }

}
