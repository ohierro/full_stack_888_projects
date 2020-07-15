package com.hiberus.ahorcado;

public class Game {
    public char[] selectedWord;
    public char[] currentWord;
    public int lifes = 10;

    public void initWord(char[] word) {
        selectedWord = word;
        currentWord = new char[word.length];
        for (int i = 0; i < word.length; i++) {
            currentWord[i] = '_';
        }
    }

    public void check(char character) {
        boolean hasFound = false;
        for (int i = 0; i < selectedWord.length; i++) {
            if (character == selectedWord[i]) {
                currentWord[i] = character;
                hasFound = true;
            }
        }
        if (!hasFound) {
            lifes--;
        }
    }

    public boolean hasWin() {
        for (int i = 0; i < currentWord.length; i++) {
            if( currentWord[i] == '_' ) {
                return false;
            }
        }
        return true;
    }
    public void draw() {
        System.out.println("Te quedan " + lifes + " vidas");
        for (int i = 0; i < currentWord.length; i++) {
            System.out.print(currentWord[i] + " ");
        }
        System.out.println();
    }

    public int getLifes() {
        return lifes;
    }
}
