package com.cga.actividad7;

import java.util.Scanner;
import java.util.Arrays;

// Solicitar 5 números decimales y mostrarlos en el mismo orden.

public class EjercicioDos {

	public static void main(String[] args) {

		double[] uNum = new double[5];

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce cinco números decimales");

		for (int i = 0; i < uNum.length; i++) {
			System.out.print("Inserte número decimal: ");
			uNum[i] = teclado.nextDouble();
		}

		teclado.close();

		System.out.print("Los números introducidos son: ");
		System.out.println(Arrays.toString(uNum));

//		double[] uNum = new double [5];
//		
//		Scanner teclado = new Scanner(System.in);		
//		
//		System.out.print("Introduce el primer número decimal: ");
//		uNum[0] = teclado.nextDouble();
//		
//		System.out.print("Introduce el segundo número decimal: ");
//		uNum[1] = teclado.nextDouble();
//		
//		System.out.print("Introduce el tercer número decimal: ");
//		uNum[2] = teclado.nextDouble();
//		
//		System.out.print("Introduce el cuarto número decimal: ");
//		uNum[3] = teclado.nextDouble();
//		
//		System.out.print("Introduce el quinto número decimal: ");
//		uNum[4] = teclado.nextDouble();
//		
//		System.out.println("Los números introducidos son: " + uNum[0] + ", " + uNum[1] + ", " + uNum[2] + ", " + uNum[3] + ", " + uNum[4]);
//		
//		teclado.close();

	}

}
