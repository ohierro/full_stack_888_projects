package com.hiberus.types;

public class Main {
    public static void main(String[] args) {
        Visibilidad instancia = new Visibilidad();

        // write
        instancia.publicVariable = 10;

        // read
        System.out.println(instancia.publicVariable);

        instancia.getPrivateWithAccesors();

        // write
        instancia.setPrivateVariable(5);

        // read
        // instancia.privateVariable
        System.out.println(instancia.getPrivateVariable());
    }
}
