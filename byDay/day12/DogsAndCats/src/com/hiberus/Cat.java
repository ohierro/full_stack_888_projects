package com.hiberus;

public class Cat {
    public String name;
    public int lifes;

    public Cat() {
        lifes = 7;
    }

    public void die() {
        if (lifes > 0) {
            lifes--;
        } else {
            System.out.println("HE MUERTO!!");
        }
    }
}
