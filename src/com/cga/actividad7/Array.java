package com.cga.actividad7;

import java.lang.Math;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int suma1 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            suma1 += arr[i];
            System.out.print(i + " => " + arr[i] + " \n");
//			System.out.printf("%d \n", arr[i]);
        }

//		System.out.println(Arrays.toString(arr));

        int suma = 0;
        //  Bucle que asigna a cada valor del array con : a una variable "valor"
        for (int valor : arr) {
            suma += valor;
        }

        int media = (suma1 / arr.length);

        System.out.println("La suma de todos los valores es: " + suma);
        System.out.println("La suma de todos los valores es: " + suma1);
        System.out.println("La media de todos los valores es: " + media);

    }

}
