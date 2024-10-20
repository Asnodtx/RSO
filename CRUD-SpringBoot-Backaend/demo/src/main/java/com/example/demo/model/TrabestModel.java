package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trabest")
public class TrabestModel {
    @EmbeddedId
    private TrabestIdModel id;

    @ManyToOne
    @MapsId("idest") // This maps the idest part of the composite key
    @JoinColumn(name = "idest")
    private EstudianteModel estudiante;

    @ManyToOne
    @MapsId("idt") // This maps the idt part of the composite key
    @JoinColumn(name = "idt")
    private TrabajadorModel trabajador;

    @Column(name = "observacion", length = 50)
    private String observacion;

    @Column(name = "diagnostico", length = 100)
    private String diagnostico;

    // Getters and Setters
    public TrabestIdModel getId() {
        return id;
    }

    public void setId(TrabestIdModel id) {
        this.id = id;
    }

    public EstudianteModel getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteModel estudiante) {
        this.estudiante = estudiante;
    }

    public TrabajadorModel getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorModel trabajador) {
        this.trabajador = trabajador;
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

