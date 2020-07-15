package com.hiberus.ahorcado;

import java.util.Random;

public class WordGenerator {
    public String[] words = new String[] {
            "Hola",
            "Mundo",
            "Desde",
            "Java"
    };

    public char[] randomWord() {
        Random random = new Random();
        int posicionAleatoria = random.nextInt(words.length);

        char[] palabra =  words[posicionAleatoria].toCharArray();
        return palabra;
    }
}
