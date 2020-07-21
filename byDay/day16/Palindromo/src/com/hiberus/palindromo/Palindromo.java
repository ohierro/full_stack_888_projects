package com.hiberus.palindromo;

public class Palindromo {

    public boolean check(String cadena) {
        char[] cadenaChar = getCadenaSinEspacios(cadena);
        return checkPalindromo(cadenaChar);
    }

    private char[] getCadenaSinEspacios(String cadena) {
        cadena = cadena.replace(" ", "");
        cadena = cadena.toLowerCase();

        return cadena.toCharArray();
    }

    private boolean checkPalindromo(char[] cadenaChars) {
        for (int i = 0; i < cadenaChars.length; i++) {
            if (cadenaChars[i] != cadenaChars[cadenaChars.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
