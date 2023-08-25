package com.cga.actividad4;

import java.util.Scanner;

/*Crear un programa que pida el radio de un círculo y calcule
su área mediante la siguiente fórmula La fórmula es: área = PI * radio2*/

public class CincoArea {

	public static void main(String[] args) {

		double R, A;
		final double PI = 3.14;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca el radio de un circulo: ");
		R = teclado.nextDouble();

		A = PI * (R * R);

		System.out.printf("El área del circulo es: %.2f", A);

		teclado.close();
	}

}