package com.cga.pro;

public class EjemploCadenas {

	public static void main(String[] args) {
		
		String cad1 = "Bienvenido", cad2 = "Esta es una frase compuesta", cad3 = "Este es otro ejemplo de cadena de texto";
		
		System.out.println("El metodo concat junta dos strings en uno mismo: " + cad1.concat(cad2));
		System.out.println("El metodo Length te dice cuantos caracteres tiene un string: " + cad1.length());
		System.out.println("toUpperCase convierte la cadena de texto en mayusculas: " + cad3.toUpperCase());
		System.out.println("raplaceAll sustituye un caracter por otro asignado: " + cad3.replace("e", "3"));
		System.out.println("El metodo equals compara dos string retornando true or false: " + cad3.equals(cad2));
		System.out.println("Crea un hashcode de la cadena: " + cad3.hashCode());
		System.out.println("El metodo substring escoge parte de la cadena para mostrar: " + cad2.substring(8, 27));
		
	}

}
