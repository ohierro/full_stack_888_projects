package com.hiberus.traductor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Traductor traductor = new Traductor();

        System.out.println("Introduzca palabra: ");
        String palabra = input.nextLine();

        String palabraTraducida = traductor.traducirDesdeIngles(palabra);
        System.out.println("Palabra traducida: " + palabraTraducida);
    }
}
