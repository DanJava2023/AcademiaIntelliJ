package com.cga.herenciaFigura;

public abstract class Figura {

    // Atributos
    private double x;
    private double y;

    // Constructor vacío
    public Figura() {
    }

    // Constructor parametrizado
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract double area();

    public abstract double perimetro();

}
