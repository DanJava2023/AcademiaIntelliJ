package com.cga.actividad7;

import java.lang.Math;

// Rellenar un array con 10 números aleatorios, mostrar la suma de todos y la media.

public class EjercicioUno {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int suma = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			suma += arr[i];
			System.out.print(i + " => " + arr[i] + " \n");
		}

		int media = (suma / arr.length);

		System.out.println("La suma de todos los valores es: " + suma);
		System.out.println("La media de todos los valores es: " + media);
	}

}
