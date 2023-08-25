package com.cga.pro;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);
		
		//Se pide un dato al usuario, en este caso su nombre
		System.out.print("Por favor introduzca su nombre: ");
		
		//Se lee el nombre con nextLine() que retorna un String con el dato
		String nombre = sc.nextLine();
		
		//Se pide otro dato al usuario, en este caso su edad
		System.out.print("Bienvenido " + nombre + ". Por favor, introduzca su edad: ");
		
		//Se guarda la edad directamente con nextInt()
		int edad = sc.nextInt();
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
		
		// Cerramos el lector
		sc.close();
	}

}
