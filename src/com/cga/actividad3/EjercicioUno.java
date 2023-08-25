package com.cga.actividad3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Ejercicio 1: Redactar un programa en Java que muestre por pantalla los
siguientes datos, Nombre, Edad y Modulo */

public class EjercicioUno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		boolean continua;

		do {
			try {
				continua = false;
				System.out.println("Por favor introduzca su nombre: ");
				String nombre = teclado.next();

				System.out.println("Por favor introduzca el nombre de su modulo: ");
				String modulo = teclado.next();

				System.out.println("Por favor introduzca su edad: ");
				int edad = teclado.nextInt();

				System.out.println("Mi nombre es " + nombre + ".");
				System.out.println("Tengo " + edad + " años.");
				System.out.println("Estudio programación en el módulo " + modulo + ".");

				teclado.close();
			} catch (InputMismatchException e) {
				System.out.println("Introduzca solo dígitos para la edad \n");
				teclado.next();
				continua = true;
			} finally {

			}
		} while (continua);
		{

		}
	}

}
