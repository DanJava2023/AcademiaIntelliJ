package com.cga.oop7;

public class Enfermero{

    // Atributos
    private String especialidad;
    private String cargo;

    // Constructor
    public Enfermero(String especialidad, String cargo) {
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
        return  " ENFERMERO - " +
                " Especialidad: " + especialidad +
                ", Cargo: " + cargo;
    }
}
