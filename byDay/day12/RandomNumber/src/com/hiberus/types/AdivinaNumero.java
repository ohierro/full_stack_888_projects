package com.hiberus.types;

import java.util.Random;

public class AdivinaNumero {
    public int turn;
    public int randomValue;

    public AdivinaNumero() {
        turn = 10;
        randomValue = new Random().nextInt(100) + 1;
    }

    public boolean check(int number) {
        turn--;

        if (number == randomValue) {
            return true;
        } else {
            if (number < randomValue) {
                System.out.println("El valor es menor");
            } else {
                System.out.println("El valor es mayor");
            }

            return false;
        }
    }

    public boolean hasTurns() {
        return turn > 0;
    }
}
