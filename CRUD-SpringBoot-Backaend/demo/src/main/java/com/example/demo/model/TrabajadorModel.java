package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "trabajador")
public class TrabajadorModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trabajador_seq")
  @SequenceGenerator(name = "trabajador_seq", sequenceName = "trabajador_seq", allocationSize = 1)
  @Column(name = "idt")
  private Long id;

  @Column(name = "nombre", length = 30)
  private String nombre;

  @Column(name = "apellidoMat", length = 30)
  private String apellidoMaterno;

  @Column(name = "apellidoPat", length = 30)
  private String apellidoPaterno;

  @Column(name = "edad")
  private Integer edad;

  @Column(name = "sexo", length = 10)
  private String sexo;

  @Column(name = "estadoCivil", length = 15)
  private String estadoCivil;

  @Column(name = "escolaridad", length = 20)
  private String escolaridad;

  @ManyToOne
  @JoinColumn(name = "ide")
  private EmpresaModel empresa;

  @OneToMany(mappedBy = "trabajador")
  private Set<TrabestModel> trabestSet;

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

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public String getEscolaridad() {
    return escolaridad;
  }

  public void setEscolaridad(String escolaridad) {
    this.escolaridad = escolaridad;
  }

  public EmpresaModel getEmpresa() {
    return empresa;
  }

  public void setEmpresa(EmpresaModel empresa) {
    this.empresa = empresa;
  }

  public Set<TrabestModel> getTrabestSet() {
    return trabestSet;
  }

  public void setTrabestSet(Set<TrabestModel> trabestSet) {
    this.trabestSet = trabestSet;
  }
}
