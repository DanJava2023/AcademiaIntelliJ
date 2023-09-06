package com.cga.oop7;

public class Medico extends pSanitario{

    // Atributos
    private String especialidad;
    private int aniosEjerciendo;
    private int numPacientes;

    // Constructor
    public Medico(String nombreHospital, String ciudadHospital, int inauguracion, int capacidad, String nombreEmpleado, String apellidoEmpleado, int edad, String seccion, String area, String especialidad, int aniosEjerciendo, int numPacientes) {
        super(nombreHospital, ciudadHospital, inauguracion, capacidad, nombreEmpleado, apellidoEmpleado, edad, seccion, area);
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
        return  super.toString() +
                "        MÉDICO - " +
                " Especialidad: " + especialidad +
                ", Años ejerciendo: " + aniosEjerciendo +
                ", Número de pacientes: " + numPacientes;
    }
}
