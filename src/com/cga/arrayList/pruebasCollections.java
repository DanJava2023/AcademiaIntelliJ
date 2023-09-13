package com.cga.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pruebasCollections {

    public static void main(String[] args) {


        String[] arr = new String[]{"A", "B", "C", "D", "E"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Orden inverso con string:");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        System.out.println();

        ArrayList<Double> daniel = new ArrayList<Double>();

        daniel.add(2.5);
        daniel.add(3.5);
        daniel.add(5.5);
        daniel.add(8.5);
        daniel.add(1.5);

        for (int i = 0; i < daniel.size(); i++) {
            System.out.print(daniel.get(i) + " ");
        }

        System.out.println();
        System.out.println("Array 'daniel' con método reverse: ");
        Collections.reverse(daniel);
        System.out.print(daniel);


    }
}
