package com.cga.metodos;

import java.util.Scanner;

public class FuncionesMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funciones fun = new Funciones();

        int uNum = 0;

        do {
            System.out.println("Escoge un ejercicio indicando su número entre el '1' y el '13' ó introduce '0' para terminar el programa. ");
            uNum = sc.nextInt();
            System.out.println();

            switch (uNum) {
                case 1 -> {
                    System.out.println("// Ejercicio 1 - Este ejercicio muestra la palabra 'Eco...' tantas veces como el usuario quiera //");
                    System.out.println();
                    System.out.println("¿Cuantas veces quieres imprimir la palabra 'Eco...'?");
                    int ecoNum = sc.nextInt();
                    fun.eco(ecoNum);
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println("// Ejercicio 2 - Este ejercicio muestra todos los valores entre el primer y el segundo número introducido //");
                    System.out.println();
                    System.out.println("Introduce el primer número: ");
                    int betNum1 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int betNum2 = sc.nextInt();
                    System.out.println();
                    System.out.print("Los numeros entre " + betNum1 + " y " + betNum2 + " son el: ");
                    fun.between(betNum1, betNum2);
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println("// Ejercicio 3 - Este ejercicio muestra el área o el volúmen de un cilindro en función de los valores introducidos //");
                    System.out.println();
                    System.out.println("Introduce la altura del cilindro: ");
                    double altNum = sc.nextDouble();
                    System.out.println("Introduce el radio del cilindro: ");
                    double radNum = sc.nextDouble();
                    System.out.println();
                    fun.areaVolumen(altNum, radNum);
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.println("// Ejercicio 4 - Este ejercicio compara los dos valores introducidos y te muestra el mayor de ellos //");
                    System.out.println();
                    System.out.println("Introduce el primer número: ");
                    int maxNum1 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int maxNum2 = sc.nextInt();
                    System.out.println("El mayor número entre " + maxNum1 + " y " + maxNum2 + " es: " + fun.maximo(maxNum1, maxNum2));
                    System.out.print("\n");
                }
                case 5 -> {
                    System.out.println("// Ejercicio 5 - Este ejercicio devuelve 'true' ó 'false' si el carácter es una vocal o no //");
                    System.out.println();
                    System.out.print("¿El carácter 'b' es una vocal? " + fun.vocal('b'));
                    System.out.println("\n");
                }
                case 6 -> {
                    System.out.println("// Ejercicio 6 - Este ejercicio devuelve 'true' ó 'false' si el carácter introducido es una vocal o no //");
                    System.out.println();
                    System.out.print("¿El carácter que has introducido es una vocal? " + fun.userVocal());
                    System.out.println("\n");
                }
                case 7 -> {
                    System.out.println("// Ejercicio 7 - Este ejercicio devuelve 'true' ó 'false' si el número introducido es primo o no //");
                    System.out.println();
                    System.out.println("Introduce un número: ");
                    int priNum = sc.nextInt();
                    System.out.print("¿El número " + priNum + " es primo? " + fun.esPrimo(priNum));
                    System.out.println("\n");
                }
                case 8 -> {
                    System.out.println("// Ejercicio 8 - Este ejercicio te muestra cuales son los divisores primos que tiene el número introducido //");
                    System.out.println();
                    System.out.println("Introduce un número: ");
                    int divNum = sc.nextInt();
                    System.out.print("El número " + divNum + " tiene " + fun.divPrimos(divNum) + " divisores primos.");
                    System.out.println("\n");
                }
                case 9 -> {
                    System.out.println("// Ejercicio 9 - Este ejercicio es una calculadora, te pide dos números y luego pregunta que operacion quieres hacer con ellos //");
                    System.out.println();
                    System.out.println("Introduce el primer número: ");
                    int calNum1 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int calNum2 = sc.nextInt();
                    System.out.print("La solución de la operación es: " + fun.calculadora(calNum1, calNum2));
                    System.out.println("\n");
                }
                case 10 -> {
                    System.out.println("// Ejercicio 10 - Este ejercicio te pìde tres números y te muestra cual es el mayor de ellos //");
                    System.out.println();
                    System.out.println("Introduce el primer número: ");
                    int maxNum3 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int maxNum4 = sc.nextInt();
                    System.out.println("Introduce el tercer número: ");
                    int maxNum5 = sc.nextInt();
                    System.out.print("El mayor de los tres números es: " + fun.maximo(maxNum3, maxNum4, maxNum5));
                    System.out.println("\n");
                }
                case 11 -> {
                    System.out.println("// Ejercicio 11 - Este ejercicio pide un número base más un número exponencial y te calcula la potencia //");
                    System.out.println();
                    System.out.println("Introduce el primer número como base: ");
                    int potNum1 = sc.nextInt();
                    System.out.println("Introduce el segundo número como exponencial: ");
                    int potNum2 = sc.nextInt();
                    System.out.print("La potencia de " + potNum1 + " elevado a " + potNum2 + " es igual a: " + fun.potencia(potNum1, potNum2));
                    System.out.println("\n");
                }
                case 12 -> {
                    System.out.println("// Ejercicio 12 - Este ejercicio pide dos números y te devuelve el Máximo Común Divisor (mcd) //");
                    System.out.println();
                    System.out.println("Introduce el primer número: ");
                    int mcdNum1 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int mcdNum2 = sc.nextInt();
                    System.out.print("El máximo común divisor de " + mcdNum1 + " y " + mcdNum2 + " es: " + fun.mcd(mcdNum1, mcdNum2));
                    System.out.println("\n");
                }
                case 13 -> {
                    System.out.println("// Ejercicio 13 - Este ejercicio te muestra que número hay en la posición indicada de la secuencia de Fibonacci //");
                    System.out.println();
                    System.out.println("Introduce la posición de Fibonacci que quiere consultar: ");
                    int fibNum = sc.nextInt();
                    System.out.print("El valor de Fibonacci en la posición " + fibNum + " es: " + fun.fibonacci(fibNum));
                    System.out.println("\n");
                }
            }
        } while (uNum != 0);
        {
            System.out.println("Saliendo del programa...");
        }

    }
}