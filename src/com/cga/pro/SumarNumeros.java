package com.cga.pro;

import java.util.Scanner;

public class SumarNumeros {
	
	final double PI = 3.1416;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Por favor introduzca el número uno: ");		
		int valorUno = sc.nextInt();
				
		System.out.print("Por favor introduzca el número dos: ");		
		int valorDos = sc.nextInt();
		
		int resultado = valorUno + valorDos;
		
		System.out.println("La suma de los dos números es : " + resultado);		
		
		sc.close();
	}

}
