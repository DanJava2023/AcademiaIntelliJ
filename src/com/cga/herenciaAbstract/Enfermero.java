package com.cga.herenciaAbstract;

public class Enfermero extends Persona {

    // Constructor
    public Enfermero(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double incrementoSueldo(double aumento) {
        return this.getSueldo() * (aumento / 100);
    }

}
