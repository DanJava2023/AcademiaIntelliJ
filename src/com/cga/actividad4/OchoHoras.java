package com.cga.actividad4;

import java.util.Scanner;

/*Escriba un programa que pregunte al usuario la hora
actual t del reloj y un número entero de horas h, que indique qué hora
marcará el reloj dentro de h horas*/

public class OchoHoras {

	public static void main(String[] args) {

		int actual, horas, resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Indique la hora actual: ");
		actual = teclado.nextInt();

		System.out.print("Indique cuantas horas quiere que pase: ");
		horas = teclado.nextInt();
		teclado.close();

		resultado = actual;

		for (int i = horas; i > 0; i--) { // Bucle para crear un contador de 24 horas al dia
			if (resultado >= 23) {
				resultado = 0;
			}
			resultado++;
		}

		System.out.println("En " + horas + " el reloj marcará " + resultado);

	}

}
