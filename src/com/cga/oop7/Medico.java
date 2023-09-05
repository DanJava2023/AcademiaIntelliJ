package com.cga.oop7;

public class Medico{

    // Atributos
    private String especialidad;
    private int aniosEjerciendo;
    private int numPacientes;

    // Constructor
    public Medico(String especialidad, int aniosEjerciendo, int numPacientes) {
        this.especialidad = especialidad;
        this.aniosEjerciendo = aniosEjerciendo;
        this.numPacientes = numPacientes;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosEjerciendo() {
        return aniosEjerciendo;
    }

    public void setAniosEjerciendo(int aniosEjerciendo) {
        this.aniosEjerciendo = aniosEjerciendo;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    @Override
    public String toString() {
        return  " MÉDICO - " +
                " Especialidad: " + especialidad +
                ", Años ejerciendo: " + aniosEjerciendo +
                ", Número de pacientes: " + numPacientes;
    }
}
