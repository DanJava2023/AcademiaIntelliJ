package com.cga.actividad4;

import java.util.Scanner;

/*Crear otra aplicación que calcule el paso contrario, es
decir, de grados Fahrenheit a grados Centígrados.*/

public class EjercicioDos {

	public static void main(String[] args) {
		
		double C, F;
				
		Scanner teclado = new Scanner(System.in);
						
		System.out.print("Introduzca temperatura en grados Fahrenheit: ");
		F = teclado.nextDouble();
		
		C = (F - 32) / 1.8;
		
		System.out.println("La temperatura en grados centígrados es: " + C);
		
		teclado.close();		
		
	}

}