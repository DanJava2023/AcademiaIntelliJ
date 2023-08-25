package com.cga.actividad6;

import java.util.Scanner;

// Pedir una nota numérica entera entre 0 y 10, y mostrar
// dicha nota de la forma: cero, uno, dos, tres, cuatro, cinco, seis, siete,
// ocho, nueve y diez.

public class EjercicioCatorce {

	public static void main(String[] args) {
		
		int uNum;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserte un número del 0 al 10 y lo transformaré a texto: ");
		uNum = teclado.nextInt();

		switch (uNum) {
		case 0:
			System.out.print("El número es el cero");
			break;
		case 1:
			System.out.print("El número es el uno");
			break;
		case 2:
			System.out.print("El número es el dos");
			break;
		case 3:
			System.out.print("El número es el tres");
			break;
		case 4:
			System.out.print("El número es el cuatro");
			break;
		case 5:
			System.out.print("El número es el cinco");
			break;
		case 6:
			System.out.print("El número es el seis");
			break;
		case 7:
			System.out.print("El número es el siete");
			break;
		case 8:
			System.out.print("El número es el ocho");
			break;
		case 9:
			System.out.print("El número es el nueve");
			break;
		case 10:
			System.out.print("El número es el diez");
			break;
		}

		teclado.close();
	}

}
