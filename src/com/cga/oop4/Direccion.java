package com.cga.oop4;

public class Direccion {

    private String pais;
    private String calle;
    private int num;
    private String ciudad;

    public Direccion(){
    }

    public Direccion(String pais, String calle, int num, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.num = num;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return  "País = " + pais +
                ", Calle = " + calle +
                ", Número = " + num +
                ", Ciudad = " + ciudad;
    }
}
