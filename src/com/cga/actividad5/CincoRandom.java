package com.cga.actividad5;

import java.lang.Math;

// Generar un número aleatorio entre 1 y 10

public class CincoRandom {

	public static void main(String[] args) {

		int randomNum;

		randomNum = (int) (Math.random() * 10 + 1);

		System.out.println("El número aleatorio generado es: " + randomNum);

	}

}
