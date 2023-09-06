package com.cga.oop7;

public class pSanitario extends Empleado{

    // Atributos
    private String seccion;
    private String area;

    // Constructor

    public pSanitario(String nombreHospital, String ciudadHospital, int inauguracion, int capacidad, String nombreEmpleado, String apellidoEmpleado, int edad, String seccion, String area) {
        super(nombreHospital, ciudadHospital, inauguracion, capacidad, nombreEmpleado, apellidoEmpleado, edad);
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
        return  super.toString() +
                "     PERSONAL SANITARIO - " +
                " Sección: " + seccion +
                ", Área: " + area + '\n';
    }
}
