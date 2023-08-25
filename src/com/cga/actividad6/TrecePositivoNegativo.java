package com.cga.actividad6;

import java.util.Scanner;

// Leer un número e indicar si es positivo o negativo. El
// proceso se repetirá hasta que se introduzca un 0.

public class TrecePositivoNegativo {

	public static void main(String[] args) {

		int uNum;

		Scanner teclado = new Scanner(System.in);		
		
		System.out.println("Para cerrar el programa usa el número 0");
		System.out.print("Introduzca un número: ");
		uNum = teclado.nextInt();
		
		if (uNum > 0) {
			System.out.println("El número es positivo");
		} else if (uNum < 0) {
			System.out.println("El número es negativo");
		}
		
		while (uNum != 0) {
			
			System.out.print("Introduzca un número: ");
			uNum = teclado.nextInt();

			if (uNum > 0) {
				System.out.println("El número es positivo");
			} else if (uNum < 0){
				System.out.println("El número es negativo");
			}
			
			if (uNum == 0) {
				System.out.println("Cerrando programa...");
			}
		}

		teclado.close();

	}

}
