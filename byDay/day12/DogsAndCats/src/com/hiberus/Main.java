package com.hiberus;

public class Main {
    public static void main(String[] args) {
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
