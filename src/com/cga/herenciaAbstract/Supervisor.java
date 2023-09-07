package com.cga.herenciaAbstract;

public class Supervisor extends Persona {

    // Constructor
    public Supervisor(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double incrementoSueldo(double aumento) {
        return this.getSueldo() * (aumento / 100);
    }
}
