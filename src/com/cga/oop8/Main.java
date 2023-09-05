package com.cga.oop8;

public class Main {
    public static void main(String[] args) {

        Personal personal = new Personal("Pepe", "Garcia", 35);
        pSanitario psanitario = new pSanitario(personal, "Derma", 15, 50);
        pNoSanitario pnosanitario = new pNoSanitario(personal, "Caprintero", "Urgencias");

        System.out.println(psanitario);
        System.out.println(pnosanitario);

    }
}
