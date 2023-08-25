package com.cga.actividad6;

import java.util.Scanner;

// Escribir una aplicación para aprender a contar, que
// pedirá un número n y mostrará todos los números del 1 a n.

public class CincoContar {

	public static void main(String[] args) {

		int uNum, i;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		uNum = teclado.nextInt();

		teclado.close();
		
		System.out.println("Los números del 1 al " + uNum + " son: ");

		for (i = 1; i <= uNum; i++) {
			System.out.print(" " + i);
		}

	}

}
