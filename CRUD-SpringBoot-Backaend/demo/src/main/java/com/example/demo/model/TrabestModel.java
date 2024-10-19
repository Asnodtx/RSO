package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trabest")
public class TrabestModel {

    @ManyToOne
    @JoinColumn(name = "idt", referencedColumnName = "idt", nullable = false)
    private TrabajadorModel trabajador;

    @ManyToOne
    @JoinColumn(name = "idest", referencedColumnName = "idest", nullable = false)
    private EstudianteModel estudiante;

    @Column(name = "observacion", length = 50)
    private String observacion;

    @Column(name = "diagnostico", length = 100)
    private String diagnostico;

    public TrabajadorModel getTrabajador() {
      return trabajador;
    }

    public void setTrabajador(TrabajadorModel trabajador) {
      this.trabajador = trabajador;
    }

    public EstudianteModel getEstudiante() {
      return estudiante;
    }

    public void setEstudiante(EstudianteModel estudiante) {
      this.estudiante = estudiante;
    }

    public String getObservacion() {
      return observacion;
    }

    public void setObservacion(String observacion) {
      this.observacion = observacion;
    }

    public String getDiagnostico() {
      return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
      this.diagnostico = diagnostico;
    }
}
