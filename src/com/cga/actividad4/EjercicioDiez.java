package com.cga.actividad4;

import java.util.Scanner;

/* Escriba un programa que devuelva el número que se
ingresa redondeado */ 

public class EjercicioDiez {

	public static void main(String[] args) {

		double num1;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserte un número con decimales: ");
		num1 = teclado.nextDouble();

		int entero = (int) num1;

		System.out.println("El número redondeado es: " + entero);

		teclado.close();
		
		}

}

// ¡Este ejercicio no he conseguido terminarlo!