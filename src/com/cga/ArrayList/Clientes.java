package com.cga.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

    static ArrayList<Clientes> cliente = new ArrayList<Clientes>();
    static Scanner sc = new Scanner(System.in);
    static Scanner teclado = new Scanner(System.in);

    public static void leerClientes() {
        // Declaración de variables para leer los datos de los clientes.
        String nombre;
        String apellidos;
        String dni;
        int edad;
        String calle;
        int numcalle;
        int postal;
        String provincia;

        // Variable auxiliar que contendrá la referencia a cada cliente nuevo.
        Clientes aux;
        int i, N;

        // Se pide por teclado el número de clientes a leer
        do {
            System.out.println("¿Número de clientes a añadir? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); // Limpiar el intro

        // Lectura de N clientes
        for (i = 1; i <= N; i++) {
            // Leer datos de cada coche
            System.out.println("Cliente " + i);
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Apellidos: ");
            apellidos = sc.nextLine();
            System.out.println("DNI: ");
            dni = sc.nextLine();
            System.out.println("Edad: ");
            edad = sc.nextInt();
            System.out.println("Calle: ");
            calle = teclado.nextLine();
            System.out.println("Número de la calle: ");
            numcalle = sc.nextInt();
            System.out.println("Código Postal: ");
            postal = sc.nextInt();
            System.out.println("Provincia: ");
            provincia = teclado.nextLine();

            sc.nextLine(); // Limpiar el intro

            aux = new Clientes(); // Se crea un objeto Clientes y se asigna su referencia a aux

            // Se asigna valores a los atributos del nuevo objeto
            aux.setNombre(nombre);
            aux.setApellidos(apellidos);
            aux.setDni(dni);
            aux.setEdad(edad);
            aux.setCalle(calle);
            aux.setNumcalle(numcalle);
            aux.setPostal(postal);
            aux.setProvincia(provincia);

            // Se añade el objeto al final del array
            cliente.add(aux);
        }
    } // Fin del método leerClientes

    public static void mostrarClientes() {
        for (int i = 0; i < cliente.size(); i++)
            System.out.println(cliente.get(i)); // Se invoca el método toString de la class Coche
    }

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String calle;
    private int numcalle;
    private int postal;
    private String provincia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumcalle() {
        return numcalle;
    }

    public void setNumcalle(int numcalle) {
        this.numcalle = numcalle;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nApellidos: ");
        sb.append(apellidos);
        sb.append("\nDNI: ");
        sb.append(dni);
        sb.append("\nEdad: ");
        sb.append(edad);
        sb.append("\nCalle: ");
        sb.append(calle);
        sb.append("\nNúmero: ");
        sb.append(numcalle);
        sb.append("\nCódigo Postal: ");
        sb.append(postal);
        sb.append("\nProvincia: ");
        sb.append(provincia);
        return sb.toString();
    }
}
