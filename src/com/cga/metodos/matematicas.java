package com.cga.metodos;

public class matematicas {

    public int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    //  Overload un metodo o función
    public int sumar1(int num1, int num2, int num3) {
        return (num1 + num2 + num3);
    }

    public int restar(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiplicar(int num1, int num2) {
        return (num1 * num2);
    }

    public int dividir(int num1, int num2) {
        return (num1 / num2);
    }

    public String nombre(String name) {
        return name;
    }

    public void tablaMultiplicar(int num1) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }
    }

    public void esPar(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    public boolean trueFalse(int num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
