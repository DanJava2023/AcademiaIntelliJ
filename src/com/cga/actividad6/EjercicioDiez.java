package com.cga.actividad6;

import java.util.Scanner;

// Pedir una nota entera de 1 a 10 y mostrarla de la
// siguiente forma: insuficiente (de 0 a 4), suficiente (5), bien (6),
// notable (7 y 8) y sobresaliente (9 y 10)

public class EjercicioDiez {

	public static void main(String[] args) {

		int nota;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserte la nota del exámen: ");
		nota = teclado.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.print("Insuficiente");
            case 5 -> System.out.print("Suficiente");
            case 6 -> System.out.print("Bien");
            case 7, 8 -> System.out.print("Notable");
            case 9, 10 -> System.out.print("Sobresaliente");
        }
		
		teclado.close();

	}

}
