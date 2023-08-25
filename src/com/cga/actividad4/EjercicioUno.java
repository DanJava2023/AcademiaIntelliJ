package com.cga.actividad4;

import java.util.Scanner;

/*Crear un programa en Java que convierta grados
Centígrados a grados Fahrenheit. La fórmula a utilizar es la siguiente:
F = C * (9/5) + 32*/

public class EjercicioUno {

	public static void main(String[] args) {

		double C, F;
		double a = 9, b = 5;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca temperatura en grados centígrados: ");
		C = teclado.nextDouble();

		F = C * (a / b) + 32;

		System.out.printf("La temperatura en grados Fahrenheit es: %.2f", F);

		teclado.close();

	}

}
