package com.cga.actividad6;

import java.lang.Math;
import java.util.Scanner;

// Realizar un juego para adivinar un número. Para ello generar un
// número entero entre 1 y 100 de manera aleatoria, y luego ir pidiendo
// números indicando “mayor” o “menor” según sea mayor o menor con
// respecto al número generado de manera aleatoria. El proceso
// termina cuando el usuario acierta el número.
// Una vez acertado el número, debe imprimirse un mensaje indicando
// que el usuario ha acertado el número y debemos imprimir también el
// número de intentos que hemos hecho.

public class UnoAdivinar {

	public static void main(String[] args) {

		int randomNum, userNum, count;
		count = 1;

		randomNum = (int) (Math.random() * 100 + 1);

		Scanner teclado = new Scanner(System.in);

		System.out.print("Por favor introduzca un número: ");
		userNum = teclado.nextInt();

		if (userNum < randomNum) {
			System.out.println("El número generado es mayor que " + userNum);
		} else if (userNum > randomNum) {
			System.out.println("El número generado es menor que " + userNum);
		} else if (userNum == randomNum) {
			System.out.println("Perfecto! Ha adivinado el número secreto");
			System.out.println("El número de intentos es: " + count);
		}

		while (randomNum != userNum) {

			count = count + 1;

			System.out.print("Por favor introduzca un número: ");
			userNum = teclado.nextInt();

			if (userNum < randomNum) {
				System.out.println("El número generado es mayor que " + userNum);
			} else if (userNum > randomNum) {
				System.out.println("El número generado es menor que " + userNum);
			} else if (userNum == randomNum) {
				System.out.println("Perfecto! Ha adivinado el número secreto");
				System.out.println("El número de intentos es: " + count);
			}

		}

		teclado.close();

	}

}
