package com.hiberus.multiarray;

public class Main {

    public static void main(String[] args) {
	    Persona pedro = new Persona();
        Persona paco = new Persona("Paco", 20, 'H');
        Persona pepe = new Persona("Pepe", 28, 'T', "11111111H", 90, 195);

        System.out.println(pepe);
        System.out.println("IMC: " + pepe.getIMC());

        System.out.println("IMC: " + pedro.getIMC());

        Empresa empresa = new Empresa();
        empresa.altaPesona("Oliver", 28, 'H');
    }
}
