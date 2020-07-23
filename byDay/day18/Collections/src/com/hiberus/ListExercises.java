package com.hiberus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExercises {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();

        cadenas.add("Rojo");
        cadenas.add("Verde");
        cadenas.add("Amarillo");

        for (String color : cadenas) {
            System.out.println(color);
        }
//        for (int i = 0; i < cadenas.size(); i++) {
//            System.out.println(cadenas.get(i));
//        }

        Scanner input = new Scanner(System.in);
        List<Float> decimales = new ArrayList<>();
        decimales.add(0, input.nextFloat());
        decimales.add(0, 2.4f);
        decimales.add(0, 3.4f);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);

        numeros.get(3);

        for (int i=0; i<numeros.size(); i++) {
            Integer numero = numeros.get(i);
        }
        for(Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
