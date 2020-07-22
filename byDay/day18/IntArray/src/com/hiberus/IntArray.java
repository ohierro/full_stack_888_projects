package com.hiberus;

public class IntArray {
    private int[] values = new int[0];

    public void add(int value) {
        // crear un array con tamaño + 1
        int[] aux = new int[values.length + 1];

        // copiar elementos al nuevo array desde 0 a length
        for (int i = 0; i < values.length; i++) {
            aux[i] = values[i];
        }

        // poner el último elemento con valor = value
        aux[values.length] = value;

        // intercambiar los arrays
        values = aux;
    }

    public int get(int position) {
        return values[position];
    }

    public void remove(int position) {
        // crear un array con tamaño - 1
        int[] aux = new int[values.length - 1];

        // copiar elementos al nuevo array desde 0 a length
        for (int i = 0; i < values.length; i++) {
            if (i < position) {
                aux[i] = values[i];
            }
            if (i > position) {
                aux[i - 1] = values[i];
            }
        }

        // intercambiar los arrays
        values = aux;
    }
}
