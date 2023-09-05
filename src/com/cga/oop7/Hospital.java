package com.cga.oop7;

public class Hospital {

    // Atributos Hospital
    private String nombreHospital;
    private String ciudadHospital;
    private int inauguracion;
    private int capacidad;

    // Constructor
    public Hospital(String nombreHospital, String ciudadHospital, int inauguracion, int capacidad) {
        this.nombreHospital = nombreHospital;
        this.ciudadHospital = ciudadHospital;
        this.inauguracion = inauguracion;
        this.capacidad = capacidad;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getCiudadHospital() {
        return ciudadHospital;
    }

    public void setCiudadHospital(String ciudadHospital) {
        this.ciudadHospital = ciudadHospital;
    }

    public int getInauguracion() {
        return inauguracion;
    }

    public void setInauguracion(int inauguracion) {
        this.inauguracion = inauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "HOSPITAL - " +
                "Nombre del Hospital: " + nombreHospital +
                ", Ciudad: " + ciudadHospital +
                ", Año de inauguración: " + inauguracion +
                ", Capacidad: " + capacidad + " camas" + '\n';
    }
}
