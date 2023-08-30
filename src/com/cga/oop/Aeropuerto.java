package com.cga.oop;

import java.util.Calendar;

public class Aeropuerto {

    String nombre;
    String pais;
    String calle;
    int numero;
    String ciudad;
    int inauguracion;
    int capacidad;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int inauguracion, int capacidad) {
        this.nombre = nombre;
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.inauguracion = inauguracion;
        this.capacidad = capacidad;
    }

    public int aniosAbierto() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        return anioActual - inauguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
        return "Aeropuerto: " +
                "Nombre : " + nombre + ", País : " + pais + ", Calle : " + calle + ", Número : " + numero + ", Ciudad : " + ciudad +
                ", Inauguración : " + inauguracion + ", Capacidad : " + capacidad + ", Años abierto : " + aniosAbierto() + " años";
    }
}
