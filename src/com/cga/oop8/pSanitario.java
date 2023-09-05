package com.cga.oop8;

public class pSanitario extends Personal {

    private String especialidad;
    private int aniosejerciendo;
    private int pacientes;


    public pSanitario(Personal personal, String especialidad, int aniosejerciendo, int pacientes) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
        this.aniosejerciendo = aniosejerciendo;
        this.pacientes = pacientes;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosejerciendo() {
        return aniosejerciendo;
    }

    public void setAniosejerciendo(int aniosejerciendo) {
        this.aniosejerciendo = aniosejerciendo;
    }

    public int getPacientes() {
        return pacientes;
    }

    public void setPacientes(int pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "pSanitario{" +
                "especialdiad='" + especialidad + '\'' +
                ", aniosejerciendo=" + aniosejerciendo +
                ", pacientes=" + pacientes +
                "} " + super.toString();
    }
}
