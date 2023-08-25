package com.cga.actividad6;

import java.lang.Math;
import java.util.Scanner;

// Desarrollar un juego que ayude a mejorar el cálculo
// mental de la suma. El jugador tendrá que introducir la solución de la
// suma de dos números aleatorios comprendidos entre 1 y 100.
// Mientras la solución introducida sea correcta, el juego continuará.
// En caso contrario, el programa terminará y mostrará el número de
// operaciones realizadas correctamente.

public class CuatroCalculoMental {

	public static void main(String[] args) {

		int rNum1, rNum2, resultado, count;
		count = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			rNum1 = (int) (Math.random() * 100 + 1);
			rNum2 = (int) (Math.random() * 100 + 1);

			System.out.print("Cuánto es la suma de " + rNum1 + " + " + rNum2 + " : ");
			resultado = teclado.nextInt();
			
			if (resultado == (rNum1 + rNum2)) {
				count = count + 1;
				System.out.println("¡El resultado es correcto!");
			}
		}

		while (resultado == (rNum1 + rNum2));
		{
			if (resultado != (rNum1 + rNum2)) {
				System.out.println("El resultado es incorrecto");
				System.out.println("Has tenido " + count + " aciertos");
			} 
			teclado.close();
		}

	}

}
