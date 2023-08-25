package com.cga.actividad6;

import java.util.Scanner;

// Solicitar dos números distintos y mostrar cuál es el
// mayor.

public class OchoMayor {

	public static void main(String[] args) {
		
		int uNum1, uNum2;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		uNum1 = teclado.nextInt();
		System.out.print("Introduzca otro número distinto: ");
		uNum2 = teclado.nextInt();

		if (uNum1 > uNum2) {
			System.out.println("El número " + uNum1 + " es el mayor");
		} else {
			System.out.println("El número " + uNum2 + " es el mayor");
		}

		teclado.close();
	}

}
