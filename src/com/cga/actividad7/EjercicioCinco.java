package com.cga.actividad7;

import java.util.Arrays;

// Escribir la función int [ ] rellenaPares (int longitud, int fin), que crea y devuelve una
// tabla ordenada de la longitud especificada, que se encuentra rellena con números
// pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).

public class EjercicioCinco {

    public static String rellenaPares(int longitud, int fin) {

        int randNum;

        // Creamos array con longitud asignada por parametro
        int[] arr = new int[longitud];

        // Recorremos array, asignamos a la variable un número aleatorio y mientras ese número sea par se asigna al array, sino no.
        for (int i = 0; i < arr.length; i++) {
            do {
                randNum = (int) (Math.random() * fin + 2);
            } while (randNum % 2 != 0);
            {
                arr[i] = randNum;
            }
        }

        // Ordenamos el array
        Arrays.sort(arr);
        // Lo mostramos como un string
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {

        // Mostramos lista ordenada
        System.out.println("Lista ordenada de menor a mayor: \n" + rellenaPares(5, 60));

    }

}
