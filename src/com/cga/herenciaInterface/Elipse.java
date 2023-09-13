package com.cga.herenciaInterface;

public class Elipse implements Figura {

    // Atributos
    private double ejeUno;
    private double ejeDos;

    // Constructor parametrizado
    public Elipse(double ejeUno, double ejeDos) {
        this.ejeUno = ejeUno;
        this.ejeDos = ejeDos;
    }

    // Getter and Setter
    public double getEjeUno() {
        return ejeUno;
    }

    public void setEjeUno(double ejeUno) {
        this.ejeUno = ejeUno;
    }

    public double getEjeDos() {
        return ejeDos;
    }

    public void setEjeDos(double ejeDos) {
        this.ejeDos = ejeDos;
    }

    // Desarrollo del método
    @Override
    public double area() {
        return (Math.PI * ejeUno * ejeDos);
    }

    @Override
    public double perimetro() {
        return (Math.PI * (3 * (ejeUno + ejeDos)) - (Math.sqrt((3 * ejeUno + ejeDos) * (ejeUno + 3 * ejeDos))));
    }
}
