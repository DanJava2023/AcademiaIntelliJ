package com.cga.metodos;


/**
 * Creaciones de funciones en una misma clase Main.
 * Invocación de las funciones tipo void, tipos primitivos. 
 * 
 */

public class MetodoPrincipal {

	/**
	 * 
	 */
	public int sumar(int num1, int num2) {
		//1 forma
//		int suma = num1 + num2;
//		return (suma);
		// 2 forma
		return (num1 + num2);
	}//finaliza la función sumar

	public void saludo() {
		System.out.println("Hola!!!");
	}
	
	public String nombre(String nombre) {
		return nombre;
	}
	
	public double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
	
    public void imprimirTablaMultiplicar(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Crear e instanciar objeto 
		MetodoPrincipal obj = new MetodoPrincipal();
		// Acceder a la función y asignar valores a una variable
		int result = obj.sumar(2, 1);
		int result1 = obj.sumar(5, 6);
		int result2 = obj.sumar(7, 1);
		
		//Crear e instanciar otro objeto 
		MetodoPrincipal nom = new MetodoPrincipal();
		// Acceder a la función de tipo String
		System.out.println(nom.nombre("CGA"));
		
		//Crear e instanciar otro objeto 
		MetodoPrincipal sal = new MetodoPrincipal();
		// Acceder a la función de tipo void
		sal.saludo();

		//Crear e instanciar otro objeto 
		MetodoPrincipal area = new MetodoPrincipal();
		// Acceder a la función y asignar valor a una variable de tipo double
		double resulArea = area.calcularAreaCirculo(20.52);
		//Imprimir resultado
		System.out.printf("El área del círculo es: %.2f", resulArea);

		//Crear e instanciar otro objeto 
		MetodoPrincipal tabla = new MetodoPrincipal();
		// Acceder a la función de tipo void
		tabla.imprimirTablaMultiplicar(5);
		
				
		System.out.println("La sumatoria es: " + result);
		System.out.println("La otra sumatoria es: " + result1);
		System.out.println("La siguiente sumatoria es: " + result2);

	}

}
