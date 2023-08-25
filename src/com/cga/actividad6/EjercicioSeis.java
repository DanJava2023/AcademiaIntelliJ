package com.cga.actividad6;

import java.util.Scanner;

// Diseñar una aplicación que solicite al usuario un número
// e indique si es par o impar.

public class EjercicioSeis {

	public static void main(String[] args) {
		
		int uNum;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		uNum = teclado.nextInt();
		
		if (uNum % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		
		teclado.close();

	}

}
