package com.cga.oop8;

public class pNoSanitario extends Personal {

    private String oficio;
    private String area;

    public pNoSanitario(String nombre, String apellido, int edad, String oficio, String area) {
        super(nombre, apellido, edad);
        this.oficio = oficio;
        this.area = area;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "pNoSanitario{" +
                "oficio='" + oficio + '\'' +
                ", area='" + area + '\'' +
                "} " + super.toString();
    }
}
