package com.cga.actividad6;

import java.util.Scanner;

// Idear un programa que solicite al usuario un número
// comprendido entre 1 y 7, correspondiente a un día de la semana. Se
// debe mostrar el nombre del día de la semana al que corresponde. Por
// ejemplo, el número 1 corresponde a «lunes» y el 6 a «sábado».

public class EjercicioOnce {

	public static void main(String[] args) {

		int dia;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserte un número del 1 al 7 y te diré que dia de la semana es : ");
		dia = teclado.nextInt();

        switch (dia) {
            case 1 -> System.out.print("El dia es Lunes");
            case 2 -> System.out.print("El dia es Martes");
            case 3 -> System.out.print("El dia es Miércoles");
            case 4 -> System.out.print("El dia es Jueves");
            case 5 -> System.out.print("El dia es Viernes");
            case 6 -> System.out.print("El dia es Sábado");
            case 7 -> System.out.print("El dia es Domingo");
        }

		teclado.close();

	}

}
