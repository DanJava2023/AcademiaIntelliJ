package com.cga.actividad5;

import java.util.Scanner;

// Pedir dos números por pantalla y realizar la división entre
// ambos. Formatear la salida con dos decimales

public class EjercicioSeis {

	public static void main(String[] args) {

		int num1, num2;
		double resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese primer dígito: ");
		num1 = teclado.nextInt();

		System.out.print("Ingrese segundo dígito: ");
		num2 = teclado.nextInt();

		resultado = (double) num1 / num2;

		System.out.printf("El resultado de la división es: %.2f %n", resultado);

		teclado.close();

	}

}
