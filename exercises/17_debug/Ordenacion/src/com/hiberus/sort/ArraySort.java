package com.hiberus.sort;

import java.util.Random;

public class ArraySort {
    private int[] valores = new int[0];

    public ArraySort(int size) {
        valores = new int[size];
        Random random = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
        }
    }

    public void sort() {
        for (int i = 0; i < valores.length; i++) {
            sortSimple();
        }
    }

    private void sortSimple() {
        for (int j = 0; j < valores.length; j++) {
            if (valores[j] < valores[j]) {
                int aux = valores[j+1];
                valores[j+1] = valores[j];
                valores[j] = aux;
            }
        }
    }

    public void print() {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
