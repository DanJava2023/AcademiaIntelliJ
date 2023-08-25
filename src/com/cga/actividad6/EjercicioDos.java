package com.cga.actividad6;

import java.util.Scanner;

// Diseñar un programa que muestre, para cada número
// introducido por teclado, si es par, si es positivo y su cuadrado. El
// proceso se repetirá hasta que el número introducido sea 0.

public class EjercicioDos {

	public static void main(String[] args) {

		int userNum;
		double cuadrado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		userNum = teclado.nextInt();

		if (userNum % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

		if (userNum >= 0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número es negativo");
		}

		cuadrado = Math.pow(userNum, 2);
		System.out.println("El número elevado al cuadrado es: " + cuadrado);

		if (userNum == 0) {
			System.out.println("Fin del programa...");
		}

		while (userNum != 0) {

			System.out.print("Introduce un número: ");
			userNum = teclado.nextInt();

			if (userNum % 2 == 0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}

			if (userNum >= 0) {
				System.out.println("El número es positivo");
			} else {
				System.out.println("El número es negativo");
			}

			cuadrado = Math.pow(userNum, 2);
			System.out.println("El número elevado al cuadrado es: " + cuadrado);

			if (userNum == 0) {
				System.out.println("Fin del programa...");
			}
		}

		teclado.close();
	}

}
