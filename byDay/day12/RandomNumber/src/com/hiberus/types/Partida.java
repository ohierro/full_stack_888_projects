package com.hiberus.types;

import java.util.Scanner;

public class Partida {
    public static void main(String[] args) {
        AdivinaNumero adivina = new AdivinaNumero();
        Scanner input = new Scanner(System.in);
        boolean hasWin = false;

        while (adivina.hasTurns()) {
            System.out.println("Introduzca un numero: ");
            int value = input.nextInt();

            if (adivina.check(value)) {
                hasWin = true;
                break;
            }
        }

        if (hasWin) {
            System.out.println("Has ganado!!");
        } else {
            System.out.println("Has perdido!!");
        }
    }
}
