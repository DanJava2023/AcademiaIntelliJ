package com.cga.herenciaFigura;

public class Main {

    public static void main(String[] args) {

        Elipse elp = new Elipse(5, 2);

        System.out.printf("El área del elipse es: %.2f %n", elp.area());
        System.out.printf("El perímetro del elipse es: %.2f", elp.perimetro());

    }
}
