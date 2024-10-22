package com.example.demo.model;

public class EjemploModel {
    private Long id;
    private Double commision;
    private String job;
    private String name;
    private Integer prioridad;
    private Double salary;

    // Constructor
    public EjemploModel(Long id, Double commision, String job, String name, Integer prioridad, Double salary) {
        this.id = id;
        this.commision = commision;
        this.job = job;
        this.name = name;
        this.prioridad = prioridad;
        this.salary = salary;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCommision() {
        return commision;
    }

    public void setCommision(Double commision) {
        this.commision = commision;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
