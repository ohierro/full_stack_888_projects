package com.hiberus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car cocheOliver = new Car();
        cocheOliver.llenar();
        cocheOliver.viajar(200);
        int cuantoFuel = cocheOliver.getFuel();
        System.out.println(cocheOliver.toString());

        Scanner scanner = new Scanner(System.in);
        int valor = 40;

        Car cochePepito = new Car();
        cochePepito.repostar(40);
        cochePepito.viajar(20);
        int speed = cochePepito.getSpeed();

        cochePepito.llenar();
        System.out.println("Deposito lleno");

	    // write your code here
        Dog pepe = new Dog();
        pepe.name = "Pepe";
        pepe.years = 7;

        Dog paco = new Dog();
        paco.name = "Paco";
        paco.years = pepe.years;

        paco.years++;

        Cat misifu = new Cat();
        misifu.name = "Misifú";
        System.out.println("Años " + misifu.name + ": " + misifu.lifes);

        Cat garfield = new Cat();
        garfield.name = "Garfield";
        System.out.println("Años " + garfield.name + ": " + garfield.lifes);

        misifu.die();
        System.out.println("Años " + misifu.name + ": " + misifu.lifes);

        misifu.die();
        misifu.die();
        misifu.die();
        misifu.die();
        misifu.die();
        misifu.die();
        misifu.die();
        misifu.die();
        //garfield.lifes = 7;

        System.out.println(pepe.name + "," + paco.name + ", " + misifu.name);
    }
}
