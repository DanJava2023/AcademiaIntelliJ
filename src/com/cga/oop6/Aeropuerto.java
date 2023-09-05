package com.cga.oop6;

import java.util.Calendar;

public class Aeropuerto {

    // Variable final
    private final int MAX_AVIONES = 10;

    // Atributos
    private Direccion dr;
    private String nombre;
    private int inauguracion;

    // Atributo estático
    private static int id_autonumerado = 1;
    private int id;

    public Avion[] getAviones() {
        return aviones;
    }

    public void setAviones(Avion[] aviones) {
        this.aviones = aviones;
    }

    public int getNumAviones() {
        return numAviones;
    }

    public void setNumAviones(int numAviones) {
        this.numAviones = numAviones;
    }

    private int capacidad;
    // Atributo nuevo
    private Avion[] aviones;
    private int numAviones;

    // Constructor vacío
    public Aeropuerto() {
    }

    // Constructor lleno usando el método Direccion
    public Aeropuerto(Direccion dr, String nombre, int inauguracion, int capacidad) {
        this.id = id_autonumerado++;
        this.dr = dr;
        this.nombre = nombre;
        this.inauguracion = inauguracion;
        this.capacidad = capacidad;
        // Atributo nuevo
        this.aviones = new Avion[MAX_AVIONES];
        this.numAviones = 0;
    }

    // Constructor lleno instanciando el método Direccion
//    public Aeropuerto(String nombre, String pais, String calle, int num, String ciudad, int inauguracion, int capacidad) {
//        this.dr = new Direccion(pais, calle, num, ciudad);
//        this.nombre = nombre;
//        this.inauguracion = inauguracion;
//        this.capacidad = capacidad;
//        // Atributo nuevo
//        this.aviones = new Avion[MAX_AVIONES];
//        this.numAviones = 0;
//    }

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

    // Función/Método para contabilizar los aviones
    public void addAviones(Avion a) {
        if (numAviones <= MAX_AVIONES) {
            this.aviones[numAviones] = a;
            numAviones++;
        } else {
            System.out.println("¡No se puede añadir más aviones!");
        }
    }

    // Función/Método para mostrar los aviones
    public String mostrarAviones() {
        String avionesCadena = "";
        for (int i = 0; i < numAviones; i++) {
            avionesCadena += this.aviones[i].toString() + "\n";
        }
        return avionesCadena;
    }

    @Override
    public String toString() {
        return "AEROPUERTO - " +
                " ID del aeropuerto: " + this.id +
                " - Dirección: " + dr +
                ", Nombre = " + nombre +
                ", Inauguración = " + inauguracion +
                ", Capacidad = " + capacidad +
//              ", Aviones = " + Arrays.toString(aviones) +
                ", Número de Aviones = " + numAviones + "/" + MAX_AVIONES;
    }
}
