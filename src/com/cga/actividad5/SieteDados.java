package com.cga.actividad5;

import java.lang.Math;

//Tenemos dos jugadores y dos dados. El primer jugador
//realiza su tirada y lanza los dados. Posteriormente, el segundo jugador
//realiza su tirada y lanza de nuevo los dados. Mostrar la tirada más alta
//(suma de los dos dados) de las dos

public class SieteDados {

	public static void main(String[] args) {

		int dado1, dado2, dado3, dado4, media;

		dado1 = (int) (Math.random() * 6 + 1);
		dado2 = (int) (Math.random() * 6 + 1);
		dado3 = (int) (Math.random() * 6 + 1);
		dado4 = (int) (Math.random() * 6 + 1);

		System.out.println("El jugador 1 hace su lanzamiento:");
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);

		System.out.println("El jugador 2 hace su lanzamiento:");
		System.out.println("Dado 1: " + dado3);
		System.out.println("Dado 2: " + dado4);

		int jug1 = dado1 + dado2;
		int jug2 = dado3 + dado4;

		if (jug1 > jug2) {
			System.out.println("La tirada mas alta es: " + jug1);
			System.out.println("El ganador fue el jugador 1");
		} else if (jug1 < jug2) {
			System.out.println("La tirada mas alta es: " + jug2);
			System.out.println("El ganador fue el jugador 2");
		} else {
			System.out.println("Empate");
		}

		media = (dado1 + dado2 + dado3 + dado4) / 4;
		
		System.out.println("La media de los dados es " + media);

	}

}
