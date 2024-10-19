package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "formulario")
public class FormularioModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formulario_seq")
  @SequenceGenerator(name = "formulario_seq", sequenceName = "formulario_seq", allocationSize = 1)
  @Column(name = "idf")
  private Long id;

  @Column(name = "folio", length = 10)
  private String folio;

  @Column(name = "fecha")
  @Temporal(TemporalType.DATE)
  private Date fecha;

  @Column(name = "respuesta")
  private String respuesta;

  @ManyToOne
  @JoinColumn(name = "idt")
  private TrabajadorModel trabajador;

  @ManyToOne
  @JoinColumn(name = "idc")
  private CategoriaModel categoria;

  @ManyToOne
  @JoinColumn(name = "idp")
  private PreguntaModel pregunta;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFolio() {
    return folio;
  }

  public void setFolio(String folio) {
    this.folio = folio;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getRespuesta() {
    return respuesta;
  }

  public void setRespuesta(String respuesta) {
    this.respuesta = respuesta;
  }

  public TrabajadorModel getTrabajador() {
    return trabajador;
  }

  public void setTrabajador(TrabajadorModel trabajador) {
    this.trabajador = trabajador;
  }

  public CategoriaModel getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaModel categoria) {
    this.categoria = categoria;
  }

  public PreguntaModel getPregunta() {
    return pregunta;
  }

  public void setPregunta(PreguntaModel pregunta) {
    this.pregunta = pregunta;
  }

}
