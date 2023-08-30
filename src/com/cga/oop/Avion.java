package com.cga.oop;

public class Avion {

    private String modelo;
    private int nAsientos;
    private int vMax;

    // Constructor vacío
    public Avion() {
        this.modelo = "";
        this.nAsientos = 0;
        this.vMax = 0;
    }

    // Constructor con parámetros
    public Avion(String modelo, int nAsientos, int vMax) {
        this.modelo = modelo;
        this.nAsientos = nAsientos;
        this.vMax = vMax;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public int getvMax() {
        return vMax;
    }

    public void setvMax(int vMax) {
        this.vMax = vMax;
    }

    @Override
    public String toString() {
        return "Avión " +
                "Modelo = " + modelo + '\'' +
                ", Número de Asientos = " + nAsientos +
                ", Velocidad Máxima = " + vMax + " Km/h";
    }
}
