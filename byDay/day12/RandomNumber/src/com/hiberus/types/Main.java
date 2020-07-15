package com.hiberus.types;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int turn = 0;
        int userInput = -1;
        int randomValue = random.nextInt(100);
        boolean hasWin = false;

        while (turn < 10) {
            System.out.println("Introduzca un número");
            userInput = scanner.nextInt();

            if (userInput > randomValue) {
                System.out.println("El valor es menor");
            }
            if (userInput < randomValue) {
                System.out.println("El valor es mayor");
            }
            if (userInput == randomValue) {
                hasWin = true;
                break;
            }

            turn++;
        }

        if (hasWin) {
            System.out.println("Has ganado!!");
        } else {
            System.out.println("Has perdido!!");
        }
    }
}
