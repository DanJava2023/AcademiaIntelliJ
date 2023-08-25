package com.cga.actividad6;

import java.util.Scanner;

// Pedir dos números enteros y decir si son iguales o no.

public class SieteIguales {

	public static void main(String[] args) {

		int uNum1, uNum2;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca el primer número: ");
		uNum1 = teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		uNum2 = teclado.nextInt();

		if (uNum1 == uNum2) {
			System.out.println("¡Son números iguales!");
		} else {
			System.out.println("Son números distintos");
		}

		teclado.close();

	}

}
