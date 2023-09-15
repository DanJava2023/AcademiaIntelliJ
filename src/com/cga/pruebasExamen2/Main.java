package com.cga.pruebasExamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Libro> libros = new ArrayList<Libro>();

    public static void main(String[] args) {

        int uNum;
        String userCat = "";
        do {
            System.out.println("1. Cargar libros" + "\n" + "2. Mostrar Libros" + "\n" + "3. Precio mayor" + "\n" + "4. Categorías");
            uNum = sc.nextInt();

            switch (uNum) {
                case 1:
                    cargar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    precio();
                    break;
                case 4:
                    System.out.println("Escoge una categoría entre: 'Fantasía', 'Manga' ó 'Ciencia-Ficción': ");
                    userCat = sc.next();
                    categoria(userCat);
                    break;
            }

        } while (uNum != 0);
    }

    public static void cargar() {
        System.out.println("Cargando libros...");
        libros.add(new Libro("45-567-09-2", "Juego de Tronos", "George R.R Martin", "Fantasía", 1999, 24.99));
        libros.add(new Libro("42-765-23-9", "El Imperio Final", "Brandon Sanderson", "Fantasía", 2005, 29.99));
        libros.add(new Libro("87-182-12-5", "Kimetsu no Yaiba", "Naruto Uzumaki", "Manga", 1989, 4.99));
        libros.add(new Libro("21-905-45-2", "Blade Runner", "Isaac Asimov", "Ciencia-Ficción", 1979, 14.99));
        System.out.println("Libros cargados correctamente.");
    }

    public static void listar() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros cargados.");
            return;
        }

        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i));
        }
    }

    public static void precio() {

        Libro libroMayorPrecio = libros.get(0);

        for (int i = 1; i < libros.size(); i++) {
            Libro libroActual = libros.get(i);
            if (libroActual.getPrecio() > libroMayorPrecio.getPrecio()) {
                libroMayorPrecio = libroActual;
            }
        }
        System.out.println(libroMayorPrecio);
    }

    public static void categoria(String categoria) {

        System.out.println("Libros en la categoría '" + categoria + "':");
        boolean encontrados = false;

        for (Libro libro : libros) {
            if (libro.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(libro);
                encontrados = true;
            }
        }

        if (!encontrados) {
            System.out.println("No se encontraron libros en la categoría '" + categoria + "'.");
        }
    }

}
