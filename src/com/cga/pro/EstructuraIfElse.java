package com.cga.pro;

import java.util.Scanner;

public class EstructuraIfElse {

	public static void main(String[] args) {
		
		int number;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Inserte un número: ");
		number = teclado.nextInt();
						
		if (number % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
		
		teclado.close();
	}

}
