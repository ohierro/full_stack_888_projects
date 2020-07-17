package com.hiberus.types;

import java.util.Scanner;

public class FIFO {
    private int[] valores = new int[0];
    private int capacity = -1;

    public FIFO() {}

    public FIFO(int capacity) {
        this.capacity = capacity;
    }

    public void push(int value) {
        if (!checkCapacity()) {
            return;
        }
        int[] aux = new int[valores.length + 1];

        aux[0] = value;
        for (int i = 0; i<valores.length; i++) {
            aux[i + 1] = valores[i];
        }

        valores = aux;
    }

    private boolean checkCapacity() {
        if (capacity != -1 &&
              capacity < valores.length) {
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        int result = valores[valores.length - 1];
        int[] aux = new int[valores.length - 1];

        for (int i = 0; i<valores.length - 1; i++) {
            aux[i] = valores[i];
        }

        valores = aux;
        return result;
    }
}
