package com.hiberus.types;

public class Main {

    public static void main(String[] args) {
	    Account cuenta1 = new Account(1000);
        Account cuenta2 = new Account();

        cuenta1.ingresar(500);
        cuenta1.retirar(500);

        Bank bank = new Bank();
        Account cuenta3 = bank.createAccount();
        bank.transfer(cuenta1, cuenta3, 300);

        String cadena = "Hola " + cuenta1;
        System.out.println(cuenta1);
    }
}
