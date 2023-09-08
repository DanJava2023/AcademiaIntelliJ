package com.cga.herenciaAnimal;

public class Anfibio {

    // Atributos
    double tamanio;
    String color;
    double peso;

    // Constructor
    public Anfibio(double tamanio, String color, double peso) {
        this.tamanio = tamanio;
        this.color = color;
        this.peso = peso;
    }

    // Getter and Setter
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
