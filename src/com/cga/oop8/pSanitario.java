package com.cga.oop8;

public class pSanitario extends Personal {

    private String especialdiad;
    private int aniosejerciendo;
    private int pacientes;


    public pSanitario(String especialdiad, int aniosejerciendo, int pacientes) {
        super(nombre, apellido, edad);
        this.especialdiad = especialdiad;
        this.aniosejerciendo = aniosejerciendo;
        this.pacientes = pacientes;
    }

    public String getEspecialdiad() {
        return especialdiad;
    }

    public void setEspecialdiad(String especialdiad) {
        this.especialdiad = especialdiad;
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
                "especialdiad='" + especialdiad + '\'' +
                ", aniosejerciendo=" + aniosejerciendo +
                ", pacientes=" + pacientes +
                "} " + super.toString();
    }
}
