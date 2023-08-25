package com.cga.actividad5;

import java.lang.Math;
import java.util.Scanner;

// Crear un programa que pida el radio de un círculo y calcule
// su área

public class DosArea {

	public static void main(String[] args) {

		double R, A;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca el radio de un circulo: ");
		R = teclado.nextDouble();

		teclado.close();

		A = Math.PI * Math.pow(R, 2);

		System.out.println("El área del circulo es: " + A);

	}

}
