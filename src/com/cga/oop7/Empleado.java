package com.cga.oop7;

public class Empleado extends Hospital {

    // Atributos
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int edad;
    private static int id_autonumerado = 1;
    private int id;

    // Constructor
    public Empleado(String nombreHospital, String ciudadHospital, int inauguracion, int capacidad, String nombreEmpleado, String apellidoEmpleado, int edad) {
        super(nombreHospital, ciudadHospital, inauguracion, capacidad);
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.edad = edad;
        this.id = id_autonumerado++;
    }

    public int getId() {
        return id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   EMPLEADO - " +
                "ID del empleado: " + this.id +
                " Nombre: " + nombreEmpleado +
                ", Apellido: " + apellidoEmpleado +
                ", Edad: " + edad + '\n';
    }
}
