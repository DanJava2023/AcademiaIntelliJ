package com.cga.actividad5;

import java.util.Scanner;

public class Redondeo {

	public static void main(String[] args) {

		double numero;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un numero con decimal: ");
		numero = teclado.nextDouble();

		long resultado = Math.round(numero);

		System.out.println("Redondeando al entero más cercano el número " + numero + ": " + resultado);
		
		teclado.close();
	}
}