package com.hiberus.types;

public class Account {
    private int saldo;

    public Account(int saldo) {
        this.saldo = saldo;
    }

    public Account() {}

    public void ingresar(int cuanto) {
        saldo += cuanto;
    }

    public boolean retirar(int cuanto) {
        if (cuanto < saldo) {
            saldo -= cuanto;
            return true;
        }

        return false;
    }

    public String toString() {
        return "Saldo de la cuenta (" + saldo + ")";
    }
}
