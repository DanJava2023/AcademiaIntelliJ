package com.cga.oop7;

public class Enfermero extends pSanitario{

    // Atributos
    private String especialidad;
    private String cargo;

    // Constructor


    public Enfermero(String nombreHospital, String ciudadHospital, int inauguracion, int capacidad, String nombreEmpleado, String apellidoEmpleado, int edad, String seccion, String area, String especialidad, String cargo) {
        super(nombreHospital, ciudadHospital, inauguracion, capacidad, nombreEmpleado, apellidoEmpleado, edad, seccion, area);
        this.especialidad = especialidad;
        this.cargo = cargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "       ENFERMERO - " +
                " Especialidad: " + especialidad +
                ", Cargo: " + cargo;
    }
}
