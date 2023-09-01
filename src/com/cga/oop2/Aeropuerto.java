package com.cga.oop2;

import java.util.Calendar;

public class Aeropuerto {

    private Direccion dr;
    private String nombre;
    private int inauguracion;
    private int capacidad;

    // Constructor vacío
    public Aeropuerto() {
    }

    // Constructor lleno usando el método Direccion
    public Aeropuerto(Direccion dr, String nombre, int inauguracion, int capacidad) {
        this.dr = dr;
        this.nombre = nombre;
        this.inauguracion = inauguracion;
        this.capacidad = capacidad;
    }

    // Constructor lleno instanciando el método Direccion
    public Aeropuerto(String nombre, String pais, String calle, int num, String ciudad, int inauguracion, int capacidad) {
        this.dr = new Direccion(pais, calle, num, ciudad);
        this.nombre = nombre;
        this.inauguracion = inauguracion;
        this.capacidad = capacidad;
    }

    public int aniosAbierto() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        return anioActual - inauguracion;
    }

    public Direccion getDr() {
        return dr;
    }

    public void setDr(Direccion dr) {
        this.dr = dr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "AEROPUERTO " +
                " Dirección: " + dr +
                ", Nombre = " + nombre +
                ", Inauguración = " + inauguracion +
                ", Capacidad = " + capacidad;
    }
}
