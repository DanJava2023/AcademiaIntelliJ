package com.cga.arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class CochesMain {

    static ArrayList<Coche> coches = new ArrayList<Coche>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        leerCoches();
        System.out.println("\nCoches introducidos: ");
        mostrarCoches();
        mostrarPorMarca();
        mostrarPorKm();
        System.out.println("\nCoche con mayor número de Km: " + mostrarMayorKm());
        System.out.println("\nCoches ordenados de menor a mayor número de Km");
        mostrarOrdenadoPorKm();
        eliminarIndice();

    }

    // Método para leer coches e introducirlos en el array.
    public static void leerCoches() {
        // Declaración de variables para leer los datos de los coches.
        String matricula;
        String marca;
        String modelo;
        int Km;
        int Id;

        // Variable auxiliar que contendrá la referencia a cada coche nuevo.
        Coche aux;
        int i, N;

        // Se pide por teclado el número de coches a leer
        do {
            System.out.println("¿Número de coches? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); // Limpiar el intro

        // Lectura de N coches
        for (i = 1; i <= N; i++) {
            // Leer datos de cada coche
            System.out.println("Coche " + i);
            Id = i;
            System.out.println("Matrícula: ");
            matricula = sc.nextLine();
            System.out.println("Marca: ");
            marca = sc.nextLine();
            System.out.println("Modelo: ");
            modelo = sc.nextLine();
            System.out.println("Número de Kilómetros: ");
            Km = sc.nextInt();

            sc.nextLine(); // Limpiar el intro

            aux = new Coche(); // Se crea un objeto Coche y se asigna su referencia a aux

            // Se asigna valores a los atributos del nuevo objeto
            aux.setMatricula(matricula);
            aux.setMarca(marca);
            aux.setModelo(modelo);
            aux.setKm(Km);
            aux.setId(Id);

            // Se añade el objeto al final del array
            coches.add(aux);
        }
    } // Fin del método leerCoches()

    // Método para mostrar todos los coches
    public static void mostrarCoches() {
        for (int i = 0; i < coches.size(); i++)
            System.out.println(coches.get(i)); // Se invoca el método toString de la class Coche
    }

    // Método para mostrar todos los coches de una marca que se pido por telcado
    public static void mostrarPorMarca() {
        String marca;
        System.out.println("Introduce marca: ");
        marca = sc.nextLine();
        System.out.println("Coches de la marca " + marca);
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getMarca().equalsIgnoreCase(marca))
                System.out.println(coches.get(i));
        }
    }

    //Método para mostrar todos los coches con un número de Km inferior al número de Km que se pide por teclado
    public static void mostrarPorKm() {

        int Km;

        System.out.println("Introduce número de kilómetros: ");
        Km = sc.nextInt();
        System.out.println("Coches con menos de " + Km + " Km");
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getKm() < Km)
                System.out.println(coches.get(i));
        }
    }

    // Método que devuelve el Coche con mayor número de Km
    public static Coche mostrarMayorKm() {
        Coche mayor = coches.get(0);
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getKm() > mayor.getKm())
                mayor = coches.get(i);
        }
        return mayor;
    }

    // Método que muestra los coches ordenador por número de Km de menor a mayor
    public static void mostrarOrdenadoPorKm() {
        int i, j;
        Coche aux;
        for (i = 0; i < coches.size() - 1; i++)
            for (j = 0; j < coches.size() - i - 1; j++)
                if (coches.get(j + 1).getKm() < coches.get(j).getKm()) {
                    aux = coches.get(j + 1);
                    coches.set(j + 1, coches.get(j));
                    coches.set(j, aux);
                }
        mostrarCoches();
    }

    // Método que elimina un índice
    public static void eliminarIndice() {
        int index;

        System.out.println("Introduce la ID del coche para eliminarlo: ");
        index = sc.nextInt();
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getId() == index) {
                coches.remove(i);
            }

        }
        mostrarCoches();
    }
}
