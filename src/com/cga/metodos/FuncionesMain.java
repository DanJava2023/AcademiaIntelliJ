package com.cga.metodos;

public class FuncionesMain {

    public static void main(String[] args) {

        Funciones fun = new Funciones();

        // Ejercicio 1
        fun.eco(10);
        System.out.println("\n");

        // Ejercicio 2
        fun.between(-5, 3);
        System.out.print("\n");

        // Ejercicio 3
        fun.areaVolumen(10.25, 10.25);
        System.out.println("\n");

        // Ejercicio 4
        System.out.println("El mayor número de los dos es: " + fun.maximo(10, 15));
        System.out.print("\n");

        // Ejercicio 5
        System.out.print("¿El carácter es una vocal? " + fun.vocal('b'));
        System.out.println("\n");

        // Ejercicio 6
        System.out.print("¿El carácter que has introducido es una vocal? " + fun.userVocal());
        System.out.println("\n");

        // Ejercicio 7
        System.out.print("¿El número introducido es primo? " + fun.esPrimo(101));
        System.out.println("\n");

        // Ejercicio 8
        System.out.print("El número introducido tiene " + fun.divPrimos(100) + " divisores primos.");
        System.out.println("\n");

        // Ejercicio 9
        System.out.print("La solución de la operación es: " + fun.calculadora(10, 20));
        System.out.println("\n");

        //Ejercicio 10
        System.out.print("El mayor número de los tres es: " + fun.maximo(30, 55, 225));
        System.out.println("\n");

        // Ejercicio 11
        System.out.print("La potencia es igual a: " + fun.potencia(2, 3));
        System.out.println("\n");

        // Ejercicio 12
        System.out.print("El máximo común divisor es: " + fun.mcd(14, 8));
        System.out.println("\n");

        // Ejercicio 13
        System.out.print("El valor de Fibonacci en la posición seleccionada es: " + fun.fibonacci(15));
    }

}
