package com.cga.pro;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {

		int number;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca un número entre el 1 y el 100: ");
		number = teclado.nextInt();

		switch (number) {

		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("No es 10, 20 ni 30");

		}

		teclado.close();
	}

}
