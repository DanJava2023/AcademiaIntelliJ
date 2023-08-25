package com.cga.actividad4;

import java.util.Scanner;

/*Pedir tres números por pantalla y calcular su media*/

public class SieteMedia {

	public static void main(String[] args) {
		
		double num1, num2, num3, media, total;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el primer dígito: ");
		num1 = teclado.nextDouble();
		
		System.out.print("Introduce el segundo dígito: ");
		num2 = teclado.nextDouble();
		
		System.out.print("Introduce el tercer dígito: ");
		num3 = teclado.nextDouble();
		
		total = num1 + num2 + num3;
		media = total / 3;
					
		System.out.printf("La media de los tres dígitos es: %.2f", media);
		
		teclado.close();
		
	}

}
