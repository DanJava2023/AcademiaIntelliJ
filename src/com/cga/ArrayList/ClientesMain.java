package com.cga.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

import static com.cga.ArrayList.Clientes.leerClientes;
import static com.cga.ArrayList.Clientes.mostrarClientes;

public class ClientesMain {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        leerClientes();
        mostrarClientes();

    }
}
