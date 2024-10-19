package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
public class EmpresaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa_seq")
  @SequenceGenerator(name = "empresa_seq", sequenceName = "empresa_seq", allocationSize = 1)
  @Column(name = "ide")
  private Long id;

  @Column(name = "nombre")
  private String nombre;

  @OneToMany(mappedBy = "empresa")
  private Set<TrabajadorModel> trabajadores;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Set<TrabajadorModel> getTrabajadores() {
    return trabajadores;
  }

  public void setTrabajadores(Set<TrabajadorModel> trabajadores) {
    this.trabajadores = trabajadores;
  }
}
