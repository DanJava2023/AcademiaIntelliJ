package com.cga.actividad6;

import java.lang.Math;

// Construye un programa que genera 100 números
// aleatorios mediante el uso del método o función Math.random y que
// posteriormente ofrezca al usuario la posibilidad de:
// Conocer el mayor de los números.
// Conocer el menor de los números.
// Obtener la suma de todos los números.
// Obtener la media de los números.

public class EjercicioQuince {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int suma = 0;
		int numMayor = Integer.MIN_VALUE;
		int numMenor = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			suma += arr[i];
			if (arr[i] > numMayor) {
				numMayor = arr[i];
			}
			if (arr[i] < numMenor) {
				numMenor = arr[i];
			}
			System.out.print(arr[i] + " \n");
		}

		int media = (suma / arr.length);

		System.out.println("El mayor de los números es: " + numMayor);
		System.out.println("El menor de los números es: " + numMenor);
		System.out.println("La suma de todos los valores es: " + suma);
		System.out.println("La media de todos los valores es: " + media);

	}

}
