package com.cga.metodos;

import java.lang.Math;
import java.util.Scanner;

public class Funciones {

    Scanner teclado = new Scanner(System.in);

    // Ejercicio 1
    public void eco(int n1) {
        for (int i = 0; i < n1; i++) {
            System.out.print("Eco... ");
        }
    }

    // Ejercicio 2
    public void between(int n1, int n2) {
        for (int i = n1 + 1; i < n2; i++) {
            System.out.print(i + ", ");
        }
    }

    // Ejercicio 3
    public void areaVolumen(double altura, double radio) {

        double area = 2 * Math.PI * radio * (altura + radio);
        double volumen = Math.PI * (radio * radio) * altura;

        System.out.print("Para calcular el área del cilindro pulse 1. Para calcular el volúmen del cilindro pulse 2: ");
        int uNum = teclado.nextInt();

        if (uNum == 1) {
            System.out.printf("El area es: %.2f", area);
            System.out.print("\n");
        } else if (uNum == 2) {
            System.out.printf("El volúmen es: %.2f", volumen);
            System.out.print("\n");
        }
    }

    // Ejercicio 4
    public int maximo(int n1, int n2) {
        return Math.max(n1, n2);
    }

    // Ejercicio 5
    public boolean vocal(char voc) {
        return voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u';
    }

    // Ejercicio 6
    public boolean userVocal() {
        System.out.print("Introduzca un carácter: ");
        String voc = teclado.next();

        return voc.equals("a") || voc.equals("e") || voc.equals("i") || voc.equals("o") || voc.equals("u") || voc.equals("A") || voc.equals("E") || voc.equals("I") || voc.equals("O") || voc.equals("U");
    }

    // Ejercicio 7
    public boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Ejercicio 8
    public int divPrimos(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                count++;
            }
        }
        return count;
    }

    // Ejercicio 9
    public double calculadora(double n1, double n2) {

        double operatoria = 0;

        System.out.println("Pulse 1 para sumar. Pulse 2 para restar. Pulse 3 para multiplicar. Pulse 4 para dividir. ");
        int uNum = teclado.nextInt();

        switch (uNum) {
            case 1 -> operatoria = n1 + n2;
            case 2 -> operatoria = n1 - n2;
            case 3 -> operatoria = n1 * n2;
            case 4 -> operatoria = n1 / n2;
        }
        return operatoria;
    }

    // Ejercicio 10
    public int maximo(int n1, int n2, int n3) {
        int result = Math.max(n1, n2);
        return Math.max(result, n3);
    }

    // Ejercicio 11
    public long potencia(double base, int exp) {

        long sol;

        if (exp == 0) {
            sol = 1;
        } else {
            sol = (long) (base * potencia(base, exp - 1));
        }
        return sol;
    }

    // Ejercicio 12
    public int mcd(int a, int b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        return (a >= b) ? mcd(a - b, b) : mcd(a, b - a);
    }

    // Ejercicio 13
    public int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}