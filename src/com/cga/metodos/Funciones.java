package com.cga.metodos;

import java.lang.Math;
import java.util.Scanner;

public class Funciones {

	Scanner teclado = new Scanner(System.in);

	// Ejercicio 1
	public void eco(int num1) {
		for (int i = 0; i < num1; i++) {
			System.out.print("Eco... ");
		}
	}

	// Ejercicio 2
	public void between(int num1, int num2) {
		for (int i = num1 + 1; i < num2; i++) {
			System.out.println("Los números entre " + num1 + " y " + num2 + " son " + i);
		}
	}

	// Ejercicio 3
	public void areaVolumen(double altura, double radio) {

		double area = 2 * Math.PI * radio * (altura + radio);
		double volumen = Math.PI * (radio * radio) * altura;

		System.out.print("Para calcular el area pulse 1. Para calcular el volumen pulse 2: ");
		int uNum = teclado.nextInt();

		if (uNum == 1) {
			System.out.printf("El cálculo del area es: %.2f", area);
		} else if (uNum == 2) {
			System.out.printf("El cálculo del volumen es: %.2f", volumen);
		}
	}

	// Ejercicio 4
	public int maximo(int num1, int num2) {
        return Math.max(num1, num2);
	}

	// Ejercicio 5
	public boolean vocal(char voc) {
        return voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u';
	}

	// Ejercicio 6
	public boolean userVocal(String voc) {
		System.out.print("Introduzca un carácter: ");
		voc = teclado.next();

        return voc.equals("a") || voc.equals("e") || voc.equals("i") || voc.equals("o") || voc.equals("u");
	}

	// Ejercicio 7
	public boolean esPrimo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Ejercicio 8
	public int divPrimos(int n) {
		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && esPrimo(i)) {
				count++;
			}
		}
		return count;
	}

	// Ejercicio 9
	public double calculadora(double n1, double n2) {

		double operatoria = 0;

		System.out.println("Pulse 1 para sumar. Pulse 2 para restar. Pulse 3 para multiplicar. Pulse 4 para dividir. ");
		int uNum = teclado.nextInt();

        switch (uNum) {
            case 1 -> operatoria = n1 + n2;
            case 2 -> operatoria = n1 - n2;
            case 3 -> operatoria = n1 * n2;
            case 4 -> operatoria = n1 / n2;
        }
		return operatoria;
	}

	// Ejercicio 10
	public int maximo(int num1, int num2, int num3) {
		int result = Math.max(num1, num2);
        return Math.max(result, num3);
	}

	// Ejercicio 11
	public double potencia(double base, int exp) {

		double resp;

		if (exp == 0) {
			resp = 1.0;
		} else {
			resp = base * potencia(base, exp - 1);
		}
		return resp;
	}
}
