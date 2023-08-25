package com.cga.actividad6;

import java.util.Scanner;

// Un frutero necesita calcular los beneficios anuales que
// obtiene de la venta de manzanas y peras. Por este motivo, es
// necesario diseñar una aplicación que solicite las ventas (en kilos) de
// cada semestre para cada fruta. La aplicación mostrará el importe
// total sabiendo que el precio del kilo de manzanas está fijado en 2,35
// Euros y el kilo de peras en 1,95 Euros.

public class EjercicioDoce {

	public static void main(String[] args) {

		int kPeras, kManzanas;
		double vPeras, vManzanas, tVentas;
		final double KGPERA = 1.95;
		final double KGMANZ = 2.35;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserte las ventas del semestre (en kilos) de las peras: ");
		kPeras = teclado.nextInt();

		System.out.print("Inserte las ventas del semestre (en kilos) de las manzanas: ");
		kManzanas = teclado.nextInt();

		vPeras = kPeras * KGPERA;
		vManzanas = kManzanas * KGMANZ;
		tVentas = vPeras + vManzanas;

		System.out.printf("El precio de venta total de las peras ha sido de: %.2f€\n", vPeras);
		System.out.printf("El precio de venta total de las manzanas ha sido de: %.2f€\n", vManzanas);
		System.out.printf("El precio de venta total de toda la fruta ha sido de: %.2f€", tVentas);

		teclado.close();

	}

}
