package com.cga.actividad7;

// Diseñar la función: int maximo (int t [ ]) , que devuelva el máximo valor contenido en
// la tabla t

import java.util.Arrays;

public class EjercicioCuatro {

    // Método que devuelve el valor máximo del array
    public static int maximo(int[] t) {
        int nMax = Integer.MIN_VALUE;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > nMax) {
                nMax = t[i];
            }
        }
        return nMax;
    }
    public static void main(String[] args) {

        // Array con 10 valores autorellenados
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        // Mostramos el array lleno con valores aleatorios
        System.out.println(Arrays.toString(arr));

        // Llamada al método para que muestre el número mayor del array
        System.out.println("El número mas grande del array es: " + EjercicioCuatro.maximo(arr));
    }
}

