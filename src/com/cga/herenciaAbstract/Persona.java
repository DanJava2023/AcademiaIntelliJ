package com.cga.herenciaAbstract;

public abstract class Persona {

    // Atributos
    private String nombre;
    private double sueldo;

    // Constructor con parámetros
    public Persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Método abstracto
    public abstract double incrementoSueldo(double aumento);

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
