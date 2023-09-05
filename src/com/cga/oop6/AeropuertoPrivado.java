package com.cga.oop6;

public class AeropuertoPrivado extends Aeropuerto {

    private int numSocios;

    public AeropuertoPrivado(int numSocios, Direccion dr, String nombre, int inauguracion, int capacidad) {
        super(dr, nombre, inauguracion, capacidad);
        this.numSocios = numSocios;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }

    @Override
    public String toString() {
        return "AEROPUERTO PRIVADO - " +
                "Número de Socios: " + numSocios + " " +
                 super.toString();
    }
}
