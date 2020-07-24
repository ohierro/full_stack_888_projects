package com.hiberus;

public class Car {
    private String brand;
    private String model;
    private int fuel;
    private int speed;

    Car() {

    }

    // write
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // read (getter)
    public int getSpeed() {
        return speed;
    }

    public void viajar(int km) {
        fuel = fuel - km * 7 / 100;
    }

    public void llenar() {
        fuel = 100;
    }

    public void repostar(int cuanto) {
        fuel += cuanto;
        if (fuel > 100) {
            fuel = 100;
        }
    }

    public int getFuel() {
        if (fuel > 40) {
            return fuel;
        }

        return -1;
    }
}
