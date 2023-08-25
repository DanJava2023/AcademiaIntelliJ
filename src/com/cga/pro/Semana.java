package com.cga.pro;

public class Semana {

	public static void main(String[] args) {
		
		String[] semana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

//		for (String dia : semana) {			
//			System.out.println("El dia de la semana es " + dia);

		for (int i = 0; i < semana.length; i++)
			System.out.println(semana[i]);
	}

}