package com.hiberus.sort;

public class Main {

    public static void main(String[] args) {
        ArraySort instancia = new ArraySort(30);
        instancia.sort();
        System.out.println("========= SORTED =========");
        instancia.print();
    }
}
