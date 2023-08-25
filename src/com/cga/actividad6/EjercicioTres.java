package com.cga.actividad6;

import java.util.Scanner;

//Implementar una aplicación para calcular datos
//estadísticos de las edades de los alumnos de un centro educativo.
//Se introducirán datos hasta que uno de ellos sea negativo, y se
//mostrará: la suma de todas las edades introducidas, la media, el
//número de alumnos y cuántos son mayores de edad.

public class EjercicioTres {

	public static void main(String[] args) {

		int edad, media, count, count18;
		int sumaEdad = 0;
		count = 0;
		count18 = 0;

		Scanner teclado = new Scanner(System.in);	
		
		System.out.print("Inserte la edad del alumne: ");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			count18 = count18 + 1;
		}
		
		sumaEdad = sumaEdad + edad;

		while (edad != 0) {
			
			count = count + 1;

			System.out.print("Inserte la edad del alumne: ");
			edad = teclado.nextInt();
			
			sumaEdad = sumaEdad + edad;
			
			media = sumaEdad / count;
			
			if (edad >= 18) {
				count18 = count18 + 1;
			}
				
			if (edad <= 0) {
				System.out.println("La suma de todas las edades es: " + sumaEdad);
				System.out.println("La media de todas las edades es: " + media );
				System.out.println("El número de alumnos son : " + count );
				System.out.println(count18 + " alumnos son mayores de edad.");

			}
		}
		
		teclado.close();
	}
}
