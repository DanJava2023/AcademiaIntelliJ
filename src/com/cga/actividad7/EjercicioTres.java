package com.cga.actividad7;

import java.util.Scanner;

// Solicitar cuántos números quiere introducir, solicitar la misma cantidad de números y mostrarlos
// en el orden inverso

public class EjercicioTres {

	public static void main(String[] args) {

		int uNum;

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuántos números quiere introducir?");
		uNum = teclado.nextInt();
		
		int[] arr = new int [uNum];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Introduzca el número: ");
			arr[i] = teclado.nextInt();
		}
		
		System.out.print("El orden inverso es: ");
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		teclado.close();
	}

}
