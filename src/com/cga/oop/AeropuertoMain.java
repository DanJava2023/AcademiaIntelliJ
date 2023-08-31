package com.cga.oop;

import javax.swing.*;
import java.util.Arrays;

public class AeropuertoMain {
    public static void main(String[] args) {

        Aeropuerto ae1 = new Aeropuerto("Ciudad de La Laguna", "España", "Carretera del Norte", 210, "San Cristóbal de La Laguna", 1946, 10000);

        JOptionPane.showMessageDialog(null, ae1);

        // Método aniosAbierto
//        System.out.println("Años abierto: " + ae1.aniosAbierto() + " años");

    }
}
