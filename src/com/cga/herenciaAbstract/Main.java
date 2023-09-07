package com.cga.herenciaAbstract;

public class Main {

    public static void main(String[] args) {

        Supervisor sv = new Supervisor("Roger", 2500);
        Enfermero enf = new Enfermero("Juan", 1200);

        double incSup = sv.incrementoSueldo(2.5);
        double incEnf = sv.incrementoSueldo(4.37);

        System.out.printf("El total del incremento del supervisor es: %.2f %n", incSup);
        System.out.printf("El total del incremento del enfermero es:  %.2f %n", incEnf);

        double sueldoSup = incSup + sv.getSueldo();
        double sueldoEnf = incEnf + enf.getSueldo();

        System.out.printf("El total del sueldo del supervisor con el incremento es: %.2f %n", sueldoSup);
        System.out.printf("El total del sueldo del enfermero con el incremento es: %.2f", sueldoEnf);

    }

}
