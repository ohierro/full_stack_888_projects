package com.hiberus.types;

public class LIFO {
    int[] valores = new int[0];

    public void push(int value) {
        int[] aux = new int[valores.length + 1];

        aux[0] = value;
        for (int i = 0; i<valores.length; i++) {
            aux[i + 1] = valores[i];
        }

        valores = aux;
    }
    public int pop() {
        int result = valores[0];
        int[] aux = new int[valores.length - 1];

        for (int i = 1; i<valores.length; i++) {
            aux[i - 1] = valores[i];
        }

        valores = aux;
        return result;
    }
}
