package com.hiberus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float velocidad = 10;


        float angle = 0;
        float velocidadX = (float) (velocidad * Math.cos(angle));
        float velocidadY = (float) (velocidad * Math.sin(angle));

        angle = 90;
        velocidadX = (float) (velocidad * Math.cos(Math.toRadians(angle)));
        velocidadY = (float) (velocidad * Math.sin(Math.toRadians(angle)));

        angle = 45;
        velocidadX = (float) (velocidad * Math.cos(angle));
        velocidadY = (float) (velocidad * Math.sin(angle));
    }
}
