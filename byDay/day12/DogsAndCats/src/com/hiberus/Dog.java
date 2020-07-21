package com.hiberus;

public class Dog {
    public String name;
    public int years;
    public int ganasDeHacerPis;

    public Dog() {

    }

    public void ladrar() {
        System.out.println("Guauu");
    }

    public void hacerPipi() {
        ganasDeHacerPis = 0;
    }

    public int cuantasGanasDeHacerpip() {
        return ganasDeHacerPis;
    }
}
