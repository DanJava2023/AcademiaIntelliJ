package com.cga.actividad4;

import java.util.Scanner;

/*Crear un programa que, dado el peso en Kilogramos y la
altura en metros de una persona, calcule y muestre por pantalla su
Índice de Masa Corporal (IMC). Este índice pretende determinar el
intervalo de peso más saludable que puede tener una persona. IMC = peso / altura2*/

public class EjercicioCuatro {

	public static void main(String[] args) {

		double altura, peso, imc;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca su peso en kilogramos: ");
		peso = teclado.nextDouble();

		System.out.print("Introduzca su altura en metros: ");
		altura = teclado.nextDouble();

		teclado.close();

		imc = peso / (altura * 2);

		System.out.printf("Tu índice de masa corporal (IMC) es: %.2f \n", imc);

		if (imc >= 18 && imc <= 25) {
			System.out.println("Estas en un intervalo saludable");
		} else if (imc < 18) {
			System.out.println("Estas por debajo del IMC");
		} else if (imc > 25) {
			System.out.println("Estas por encima del IMC");
		}

	}

}
