package com.cga.actividad4;

import java.util.Scanner;

/*Crear un programa que permita calcular el radio de una
esfera a partir de su diámetro. La fórmula es: radio = diámetro / 2*/

public class EjercicioTres {
	
	public static void main(String[] args) {
		
		double R, D;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el diametro de la esfera: ");
		D = teclado.nextDouble();
		
		R = D / 2;
		
		System.out.println("El radio de la esfera es: " + R);
		
		teclado.close();	
	}

}
