package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiante_seq")
    @SequenceGenerator(name = "estudiante_seq", sequenceName = "estudiante_seq", allocationSize = 1)
    @Column(name = "idest")
    private Long id;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @Column(name = "apellidoMat", length = 20)
    private String apellidoMaterno;

    @Column(name = "apellidoPat", length = 20)
    private String apellidoPaterno;

    @Column(name = "grupo", length = 10)
    private String grupo;

    @Column(name = "contrasenia", length = 10)
    private String contrasenia;

    @OneToMany(mappedBy = "estudiante")
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

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Set<TrabestModel> getTrabestSet() {
		return trabestSet;
	}

	public void setTrabestSet(Set<TrabestModel> trabestSet) {
		this.trabestSet = trabestSet;
	}
}
