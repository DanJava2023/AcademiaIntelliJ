package com.cga.actividad7;

import java.util.Arrays;

public class Loteria {


    public static int comparador(int[] t1, int[] t2) {
        // Inicializamos variable 'aciertos'
        int aciertos = 0;

        // Recorremos ambos arrays en busca de coincidencias
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2.length; j++) {
                if (t1[i] == t2[j]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {

        // Creamos array con una apuesta aleatoria
        int randApuesta = 0;
        // Creamos array de tamaño 6
        int[] apuesta = new int[6];
        // Rellenamos array 'apuesta' con 6 dígitos aleatorios
        for (int i = 0; i < apuesta.length; i++) {
            randApuesta = (int) (Math.random() * 49 + 1);
            if (Arrays.asList(apuesta).contains(randApuesta)) {
            }
            else apuesta[i] = randApuesta;
        }
        // Ordenamos array
        Arrays.sort(apuesta);
        // Mostramos como un string
        System.out.println("Tú apuesta: \n" + Arrays.toString(apuesta));

        //-----------------------------------------------------------------------------//

        // Creamos combinación ganadora
        int[] ganadora = {19, 25, 30, 39, 42, 44};

        // Mostramos combinación ganadora
        System.out.println("Apuesta ganadora: \n" + Arrays.toString(ganadora));

        // Mostramos el número de aciertos
        System.out.println("Número de aciertos: \n" + comparador(apuesta, ganadora));
    }

}

