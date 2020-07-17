package com.hiberus.traductor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Traductor {
    private String[] englishWords;
    private String[] spanishWords;

    public Traductor() {
        spanishWords = readStringsFromFile("spanish-words.txt");
        englishWords = readStringsFromFile("english-words.txt");
    }

    public String[] readStringsFromFile(String path) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(path));
            return strings.toArray(new String[strings.size()]);
        } catch (IOException e) {
            return null;
        }
    }

    public String traducirDesdeIngles(String palabra) {
        for (int i = 0; i < englishWords.length; i++) {
            if (englishWords[i].equals(palabra)) {
                return spanishWords[i];
            }
        }
        return palabra;
    }
}
