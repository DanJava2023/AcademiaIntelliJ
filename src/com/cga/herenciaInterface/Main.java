package com.cga.herenciaInterface;

public class Main {
    public static void main(String[] args) {

        Elipse ep = new Elipse(2, 5);

        System.out.printf("Área del elipse: %.2f %n", ep.area());
        System.out.printf("Perímetro del elipse: %.2f", ep.perimetro());

    }
}
