package com.cga.oop7;

public class pSanitario {

    // Atributos
    private String seccion;
    private String area;
    private Hospital hp;
    private Empleado empleado;

    // Constructor
    public pSanitario(Hospital hp, Empleado empleado, String seccion, String area) {
        this.hp = hp;
        this.empleado = empleado;
        this.seccion = seccion;
        this.area = area;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return  " " + hp + empleado + " PERSONAL SANITARIO " + " Sección: " + seccion + ", Área: " + area;

    }
}
