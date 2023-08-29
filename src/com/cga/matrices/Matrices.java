package com.cga.matrices;

import java.util.Scanner;
import java.lang.Math;

public class Matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Se crea una matriz de 4 filas y 3 columnas
        int[][] a2d = new int[4][3];

        // Se carga la matriz
        System.out.println("Carga los valores en la matriz: ");
        for (int i = 0; i < 4; i++) { // Recorrido de filas
            for (int j = 0; j < 3; j++) { // Recorrido de columnas
//				System.out.print("a2d[" + i + "][" + j + "]= ");
                a2d[i][j] = (int) (Math.floor(Math.random() * (-100 - 100 + 1) + 100)); // Metodo Random con valores entre -100 y 100
            }
        }

        System.out.println();

        // Mostrar por pantalla los valores que contiene la matriz
        System.out.println("Valores introducidos: ");
        for (int i = 0; i < a2d.length; i++) {
            for (int j = 0; j < a2d[i].length; j++) {
                System.out.print(a2d[i][j] + " ");
            }

            System.out.println(); // Por cada fila un ln
        }

        System.out.println(); // Por cada fila un ln

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

        sc.close();
    }

}
