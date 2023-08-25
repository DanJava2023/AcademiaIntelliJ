package com.cga.actividad5;

import java.lang.Math;
import java.util.Scanner;

//Pedir dos números por pantalla e imprimir el menor de ellos

public class CuatroMetMin {

	public static void main(String[] args) {

		int num1, num2, resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese el primer número: ");
		num1 = teclado.nextInt();

		System.out.print("Ingrese el segundo número: ");
		num2 = teclado.nextInt();

		teclado.close();

		resultado = Math.min(num1, num2);

		System.out.println("El menor número es: " + resultado);

	}

}
