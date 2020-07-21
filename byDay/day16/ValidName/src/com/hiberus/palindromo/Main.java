package com.hiberus.palindromo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckNames instance = new CheckNames();
        System.out.println("Is valid: " + instance.check("ohierro1"));
        System.out.println("Is valid: " + instance.check("ohierro"));
    }
}
