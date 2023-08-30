package com.cga.oop;

public class AvionMain {
    public static void main(String[] args) {

        // Instanciar el objeto
        Avion avion1 = new Avion(); // Constructor vacío

        avion1.setModelo("Boeing 747"); // Añadimos valores a las propiedades
        avion1.setnAsientos(300);
        avion1.setvMax(900);

        System.out.println("Avión 1: " + avion1.getModelo()); // Con getModelo obtenemos solo el atributo modelo
        System.out.println("Avión 1: " + avion1);

        Avion avion2 = new Avion("Airbus a380", 850, 1185); // Constructor con parámetros

        System.out.println("Avión 2: " + avion2.getvMax()); // Con getvMax obtenemos solo el atributo velocidad
        System.out.println("Avión 2: " + avion2);
    }
}
