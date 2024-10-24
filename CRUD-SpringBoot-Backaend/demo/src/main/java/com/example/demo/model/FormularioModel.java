package com.example.demo.model;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "formulario")
public class FormularioModel {

    @Id
    @Column(name = "folio")
    private Long folio; // Clave primaria

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha; // Fecha del formulario

    @ManyToOne
    @JoinColumn(name = "idt", referencedColumnName = "idt", nullable = false)
    private TrabajadorModel trabajador; // Relación con Trabajador

    @ManyToOne
    @JoinColumn(name = "idest", referencedColumnName = "idest", nullable = false)
    private EstudianteModel estudiante; // Relación con Estudiante

    public FormularioModel() {
    }

    public Long getFolio() {
        return folio;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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
}

