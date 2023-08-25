package com.cga.actividad5;

import java.lang.Math;
import java.util.Scanner;

// Crear un programa que, dado el peso en Kilogramos y la
// altura en metros de una persona, calcule y muestre por pantalla su
// Índice de Masa Corporal (IMC

public class EjercicioUno {

	public static void main(String[] args) {

		double peso, altura, imc;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca su peso en kilogramos: ");
		peso = teclado.nextDouble();

		System.out.print("Introduzca su altura en metros: ");
		altura = teclado.nextDouble();

		teclado.close();

		altura = Math.pow(altura, 2);

		imc = peso / altura;

		imc = (int) imc;

		System.out.println("Tu índice de masa corporal (IMC) es: " + imc);

		if (imc >= 18 && imc <= 25) {
			System.out.println("Estas en un intervalo saludable.");
		} else {
			System.out.println("No estas en un intervalo saludable.");
		}

	}

}
