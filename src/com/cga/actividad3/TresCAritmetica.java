package com.cga.actividad3;

/* Ejercicio 3: Escriba el siguiente ejemplo y pruebe los resultados. El
siguiente ejemplo visualiza como resultado la suma, resta, la
multiplicación y la división de dos cantidades enteras.*/

public class TresCAritmetica {

	public static void main(String[] args) {

		int datol, dato2, dato3, resultado;

		datol = 20;
		dato2 = 10;
		dato3 = 5;

		// Suma
		resultado = datol + dato2 + dato3;
		System.out.println(datol + " + " + dato2 + " + " + dato3 + " = " + resultado);

		// Resta
		resultado = datol - dato2 - dato3;
		System.out.println(datol + " - " + dato2 + " - " + dato3 + " = " + resultado);

		// Producto
		resultado = datol * dato2 * dato3;
		System.out.println(datol + " * " + dato2 + " * " + dato3 + " = " + resultado);

		// Cociente
		resultado = datol / dato2 / dato3;
		System.out.println(datol + " / " + dato2 + " / " + dato3 + " = " + resultado);

	}
}