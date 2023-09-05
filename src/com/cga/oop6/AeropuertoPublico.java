package com.cga.oop6;

public class AeropuertoPublico extends Aeropuerto{

    // Atributos
    private double financiacion;
    private int numTrabajadoresDiscapacitados;

    // Constructor vacío
    public AeropuertoPublico() {
        super();
    }

    // Constructor con parámetros
    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, Direccion dr, String nombre, int inauguracion, int capacidad) {
        super(dr, nombre, inauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public double getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }

    public int getNumTrabajadoresDiscapacitados() {
        return numTrabajadoresDiscapacitados;
    }

    public void setNumTrabajadoresDiscapacitados(int numTrabajadoresDiscapacitados) {
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    @Override
    public String toString() {
        return "AEROPUESTO PÚBLICO - " +
                "Financiación: " + financiacion +
                ", Trabajadores Discapacitados: " + numTrabajadoresDiscapacitados + " " +
                 super.toString();
    }
}
