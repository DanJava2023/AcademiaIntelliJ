package com.cga.actividad6;

import java.util.Scanner;

// Pedir tres números y mostrarlos ordenados de mayor a
// menor.

public class EjercicioNueve {

	public static void main(String[] args) {

		int uNum1, uNum2, uNum3;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		uNum1 = teclado.nextInt();
		System.out.print("Introduzca otro número distinto: ");
		uNum2 = teclado.nextInt();
		System.out.print("Introduzca el último número: ");
		uNum3 = teclado.nextInt();

		
		// Si num1 es mayor que...
		
		if (uNum1 > uNum2 && uNum1 > uNum3 && uNum2 > uNum3) {
			System.out.println("El orden de mayor a menor es: " + uNum1 + " " + uNum2 + " " + uNum3);
		}
		
		if (uNum1 > uNum2 && uNum1 < uNum3 && uNum2 < uNum3) {
			System.out.println("El orden de mayor a menor es: " + uNum3 + " " + uNum1 + " " + uNum2);
		}
		
		if (uNum1 > uNum2 && uNum1 > uNum3 && uNum2 < uNum3) {
			System.out.println("El orden de mayor a menor es: " + uNum1 + " " + uNum3 + " " + uNum2);
		}
		
		// Si num1 es menor que...
		
		if (uNum1 < uNum2 && uNum1 > uNum3 && uNum2 > uNum3) {
			System.out.println("El orden de mayor a menor es: " + uNum2 + " " + uNum1 + " " + uNum3);
		}
		
		if (uNum1 < uNum2 && uNum1 < uNum3 && uNum2 < uNum3) {
			System.out.println("El orden de mayor a menor es: " + uNum3 + " " + uNum2 + " " + uNum1);
		}
		
		if (uNum1 < uNum2 && uNum1 > uNum3 && uNum2 < uNum3) {
			System.out.println("El orden de mayor a menor es: " + uNum2 + " " + uNum1 + " " + uNum3);
		}

		
		

		teclado.close();

	}

}
