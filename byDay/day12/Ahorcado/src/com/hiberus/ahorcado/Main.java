package com.hiberus.ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordGenerator generator = new WordGenerator();
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("AHORCADO 1.0");
        char[] randomWord = generator.randomWord();
        game.initWord(randomWord);

        while (game.getLifes() > 0) {
            System.out.println("Introduzca una letra: ");
            char userChar = scanner.nextLine().charAt(0);

            game.check(userChar);

            if (game.hasWin()) {
                System.out.println("You win!!");
                break;
            }

            game.draw();

            if (game.getLifes() == 0) {
                System.out.println("You loose");
            }
        }
    }
}
