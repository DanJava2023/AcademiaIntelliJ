package com.cga.pruebasExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Alice", 25));
        lista.add(new Persona("Bob", 30));
        lista.add(new Persona("Charlie", 20));
        lista.add(new Persona("Johnny", 31));
        lista.add(new Persona("Max", 23));
        lista.add(new Persona("Sam", 21));

        // Ordenar la lista de personas por edad usando un comparador personalizado
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getEdad() - persona2.getEdad();
            }
        });

        // Imprimir la lista ordenada
        for (Persona persona : lista) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad() + " años");
        }
    }
}