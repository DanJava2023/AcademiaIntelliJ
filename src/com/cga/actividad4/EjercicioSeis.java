package com.cga.actividad4;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Crear un programa que convierta Euros en Dólares
Estadounidenses */

public class EjercicioSeis {

	public static void main(String[] args) {
		
		double E, D, conversor;
		D = 1.10090;	
		boolean continua;
		Scanner teclado = new Scanner(System.in);
		
		do {
			try {		
				continua = false;
				System.out.print("Introduzca el valor en euros: ");
				E = teclado.nextDouble();
		
				conversor = E * D;
		
				System.out.printf("El valor en dolares es: %.2f", conversor);
		
				teclado.close();		
				
				}catch(InputMismatchException e){
					System.out.println("Introduzca solo dígitos y comas para separar decimales");
					teclado.next();
					continua = true;
					
				}finally{
					
				}
			
		  } while (continua); {
			  
			 }
			
		}
}
