package com.cga.matrices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class EjerciciosMatrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a2d = new int[4][3];

        System.out.println("Carga los valores en la matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                a2d[i][j] = (int) (Math.floor(Math.random() * (-100 - 100 + 1) + 100));
            }
        }

        System.out.println();

        System.out.println("Valores introducidos: ");
        for (int i = 0; i < a2d.length; i++) {
            for (int j = 0; j < a2d[i].length; j++) {
                System.out.print(a2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Calcular el máximo y el mínimo

        int numeroMayor = 0;
        int numeroMenor = 0;

        String mayorPosicion = "";
        String menorPosicion = "";

        for (int x = 0; x < a2d.length; x++) {
            for (int y = 0; y < a2d[x].length; y++) {
                if (a2d[x][y] > numeroMayor) {
                    numeroMayor = a2d[x][y];
                    mayorPosicion = x + "," + y;
                }
                if (a2d[x][y] < numeroMenor) {
                    numeroMenor = a2d[x][y];
                    menorPosicion = x + "," + y;
                }
            }

        }

        System.out.println("El valor mayor es: " + numeroMayor);
        System.out.println("La posición mayor es: " + mayorPosicion);

        System.out.println("El valor menor es: " + numeroMenor);
        System.out.println("La posición menor es: " + menorPosicion);

        System.out.println();


        // Ordenar de mayor a menor la primera fila y mostrarla
        System.out.println("Primera fila original:");

        int[] mayMen = new int[a2d[0].length]; // Nuevo array para almacenar la primera fila

        for (int i = 0; i < a2d[0].length; i++) { // Bucle for para recorrer el array
            int valor = a2d[0][i]; // Asignamos los valores de la primera fila a la variable 'valor'
            mayMen[i] = valor; // Asignamos esos valores al nuevo array
            System.out.print(mayMen[i] + " "); // Imprimimos el nuevo array
        }
        System.out.println();
        System.out.println("Primera fila ordenada de mayor a menor:");
        Arrays.sort(mayMen); // Usamos método .sort para ordenar el nuevo array
        System.out.println(Arrays.toString(mayMen)); // Imprimimos el muevo array con el método .toString

        System.out.println();

        // Ordenar de menor a mayor la segunda columna y mostrarla
        System.out.println("Segunda columna:");
        for (int i = 0; i < a2d.length; i++) {
            System.out.println(a2d[i][1]);
        }

        // Calcular el máximo de la suma de los valores de cada fila, mostrar
        // dichos valores de esa fila junto a la sumatoria

        sc.close();
    }

}
