package com.cga.actividad4;

import java.util.Scanner;

/* Escriba un programa que entregue la parte decimal de un
número real ingresado por el usuario*/ 

public class NueveDecimal {

	public static void main(String[] args) {
		
		float num1, decimal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca primer número con decimales: ");
		num1 = teclado.nextFloat();
		
		decimal = num1 % 1;
		
		teclado.close();
		
		System.out.println("La parte decimal del número es: " + decimal);
		
	}

}
