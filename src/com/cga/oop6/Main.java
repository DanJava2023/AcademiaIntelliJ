package com.cga.oop6;

public class Main {
    public static void main(String[] args) {

        // Instanciar el objecto de la clase Direccion
        Direccion dir = new Direccion("España", "Carretera del norte", 210, "San Cristobal de La Laguna");
        // Instanciar el objeto de la clase Aeropuerto usando el objeto dir
        Aeropuerto ae = new Aeropuerto(dir, "Aeropuerto del Norte", 1946, 15000);
        Aeropuerto ae1 = new Aeropuerto(dir, "Aeropuerto del Sur", 1985, 152000);
        AeropuertoPublico apu = new AeropuertoPublico(1500,55, dir, "Aeropuerto del Prat", 1956, 8000 );
        AeropuertoPrivado apr = new AeropuertoPrivado(2, dir, ae.getNombre(), ae.getInauguracion(), ae.getInauguracion());

        Avion av1 = new Avion("Airbus a320", 150, 900);
        Avion av2 = new Avion("Boeing 747", 175, 800);
        Avion av3 = new Avion("Airbus a350", 350, 1200);

        ae.addAviones(av2);
        ae.addAviones(av1);
        ae.addAviones(av3);

        System.out.println(ae);
        System.out.println(ae1);
        System.out.println(apu);
        System.out.println(apr);
        System.out.println();

        System.out.println(ae.mostrarAviones());

        System.out.println(ae.getNumAviones());

    }
}
