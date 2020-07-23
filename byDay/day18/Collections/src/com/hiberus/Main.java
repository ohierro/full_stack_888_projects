package com.hiberus;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<>();

        miLista.add(5);
        miLista.add(7);

        miLista.remove(1);

        for (int i = 0; i < 100; i++) {
            miLista.add(i);
        }

        for (int i = 0; i < miLista.size(); i++) {
            int value = miLista.get(i);
            System.out.println(value);
        }

        miLista.add(6, 666);
        miLista.set(6, 700);

        boolean contiene = miLista.contains(7);
    }
}
