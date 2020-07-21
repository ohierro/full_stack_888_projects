package com.hiberus.palindromo;

public class Main {

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();

        boolean result = palindromo.check("Hola que tal");
        result = palindromo.check("Logra Casillas alli sacar gol");
    }
}
