package com.hiberus.types;

public class Bank {

    public Bank() {}

    public Account createAccount() {
        return new Account();
    }

    public boolean transfer(Account src,
                         Account dst,
                         int cuanto) {
        src.retirar(cuanto);
        dst.ingresar(cuanto);
        return true;
    }
}
