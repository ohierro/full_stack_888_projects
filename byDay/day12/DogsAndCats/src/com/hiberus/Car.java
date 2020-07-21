package com.hiberus;

public class Car {
    private int fuel;

    Car() {

    }

    public void viajar(int km) {
        fuel = fuel - km * 7/100;
    }

    public void llenar() {
        fuel = 100;
    }

    public void repostar(int cuanto) {
        fuel += cuanto;
    }

    public int getFuel() {
        if (fuel > 40) {
            return fuel;
        }

        return -1;
    }
}
