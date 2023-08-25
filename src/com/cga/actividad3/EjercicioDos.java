package com.cga.actividad3;

import java.util.Scanner;

/* Ejercicio 2: Crear un programa en Java llamado Saludo que muestre el
siguiente mensaje:
Buenos días
Mi nombre es <nombre> <apellidos>*/

public class EjercicioDos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Por favor introduzca su nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Por favor introduzca su apellido: ");
		String apellido = teclado.nextLine();

		System.out.println("Buenos dias");
		System.out.println("Mi nombre es " + nombre + " " + apellido);

		teclado.close();

	}

}
