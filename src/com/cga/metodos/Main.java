package com.cga.metodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int uNum, uNum1, uNum2;
        String name;

        Scanner teclado = new Scanner(System.in);

        matematicas sum = new matematicas();
        System.out.println("La suma de 5 y 7 es: " + sum.sumar(5, 7));
        // Usar el mismo objeto con sobrecarga           -->sumar1
        System.out.println("La suma de 5, 7 y 8 es: " + sum.sumar1(5, 7, 8));

        matematicas res = new matematicas();
        System.out.println("La resta de 7 y 5 es: " + res.restar(7, 5));

        matematicas mul = new matematicas();
        System.out.println("La multiplicación de 5 y 5 es: " + mul.multiplicar(5, 5));

        matematicas div = new matematicas();
        System.out.println("La división de 14 entre 7 es: " + div.dividir(14, 7));

        matematicas nam = new matematicas();
        System.out.println("¿Como te llamas?");
        name = teclado.next();
        System.out.println("Tu nombre es: " + nam.nombre(name));

        matematicas tabla = new matematicas();
        System.out.print("Inserte un número para ver su tabla de multiplicar: ");
        uNum = teclado.nextInt();
        tabla.tablaMultiplicar(uNum);

        matematicas par = new matematicas();
        System.out.print("Inserte un número: ");
        uNum1 = teclado.nextInt();
        par.esPar(uNum1);

        matematicas bool = new matematicas();
        System.out.print("Si el número es par puedes continuar, si es impar se para el programa: ");
        uNum2 = teclado.nextInt();
        bool.trueFalse(uNum2);


        teclado.close();

    }

}
