package com.cga.oop2;

import javax.swing.*;

public class AeropuertoMain {
    public static void main(String[] args) {

        // Instanciar el objecto de la clase Direccion
        Direccion dir = new Direccion("España", "Carretera del norte", 210, "San Cristobal de La Laguna");
        // Instanciar el objeto de la clase Aeropuerto usando el objeto dir
        Aeropuerto ae = new Aeropuerto(dir, "Aeropuerto del Norte", 1946, 15000);

        System.out.println(ae);
    }
}
