package com.hiberus;

public class FirstSecondWeek {

    public static void main(String[] args) {

        // VARS
        int intVariable;
        byte byteVariable = 3;
        long longValue = 18l;
        float floatValue = 3.0f;
        double doubleValue = 3.0;
        char charValue = 'c'; // or 127 or 0x16
        boolean booleanValue = true;

        // assign values
        intVariable = 3;

        // print values
        System.out.println(intVariable);

        // STRING
        String msg = "Hola mundo";
        for (int i = 0; i<msg.length(); i++) {
            System.out.println(msg.charAt(i));
        }

        // CHAR ARRAY
        char[] msgBytes = msg.toCharArray();
        for (int i = msgBytes.length - 1; i >= 0; i--) {
            System.out.println(msgBytes[i]);
        }

        // String from array
        char[] newMsgBytes = new char[] { 'h', 'e', 'l', 'l', 'l', 'o' };
        String secondMsg = new String(newMsgBytes);
        System.out.println(newMsgBytes);
        System.out.println(secondMsg);

        String firstString = "hello";
        String secondString = "hello";
        System.out.println("First string == Second string? " + (firstString == secondString));

        String thirdString = new String(secondString);
        System.out.println("First string == Third string? " + (firstString == thirdString));
        System.out.println("First string == Third string? " + (firstString.equals(thirdString)));
        System.out.println(thirdString.equals("hello"));

        /*
            ARRAY DEFINITION
         */
        int[] arrayValues = new int[3];
        arrayValues[0] = 1;
        arrayValues[1] = 2;
        arrayValues[2] = 3;
//        arrayValues[3] = 4;
//        arrayValues[4] = 5;

        arrayValues = new int[5];
        arrayValues[0] = 1;
        arrayValues[1] = 2;
        arrayValues[2] = 3;
        arrayValues[3] = 4;
        arrayValues[4] = 5;

        int[] values = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < values.length; i++) {
            values[i] += 3;
            System.out.println(values[i]);
        }

        byte[] bValues = new byte[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < bValues.length; i++) {
            System.out.println(bValues[i]);
        }

        float[] fValues = new float[] { 1.0f, 2.0f, 3.3f, 4.0f, 6.0f };
        for (int i = 0; i < fValues.length; i++) {
            System.out.println(fValues[i]);
        }

        // FOR
        // multiples arrays: access by position
        for (int i = 0; i<values.length; i++) {
            boolean allEquals = values[i] == bValues[i] && bValues[i] == fValues[i];
            if (allEquals) {
                System.out.println("En la posición: " + i + " son todos iguales");
            } else {
                System.out.println("En la posición: " + i + " NO son todos iguales");
            }
        }


        // first and last /  odd/even
        for (int i = 0; i < values.length; i++) {
            System.out.print("Element " + i + " ");
            if (i == 0) {
                System.out.print("I'm the first element");
            }
            if (i == values.length - 1) {
                System.out.print("I'm the last element");
            }
            if (i % 2 == 0) {
                System.out.print(" EVEN ");
            } else {
                System.out.print(" ODD ");
            }

            System.out.println();
        }

        // FOUND PATTERN
        boolean found = false;
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            System.out.println(i);
            if (values[i] == 2) {
                found = true;
                index = i;
            }
        }

        if (found) {
            System.out.println("Elemento encontrado!! " + index);
        }


        // while do/while
        int counter = 0;

        while (counter < 5) {
            System.out.print(counter);
            counter++;
        }

        System.out.println();

        counter = 0;
        do {
            System.out.print(counter);
            counter++;
        } while (counter < 5);


        // BREAK/CONTINUE
        System.out.println("== START ==");
        for (int i = 0; i < values.length; i++) {
            System.out.println(i);
            if (values[i] == 5) {
                break;
            }
        }
        System.out.println("== END ==");

        System.out.println("== START ==");
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
        System.out.println("== END ==");


        // SWITCH OPERATOR
        int selection = 2;

        System.out.println("BY IF SEQUENTIAL");
        if (selection == 0) {
            System.out.println("Selection == 0");
        }
        if (selection == 1) {
            System.out.println("Selection == 1");
        }
        if (selection == 2) {
            System.out.println("Selection == 2");
        }
        if (selection == 3) {
            System.out.println("Selection == 3");
        }

        System.out.println("BY NESTED IFS");
        if (selection == 0) {
            System.out.println("Selection == 0");
        } else {
            if (selection == 1) {
                System.out.println("Selection == 1");
            } else {
                if (selection == 2) {
                    System.out.println("Selection == 2");
                } else {
                    System.out.println("Selection not available");
                }
            }
        }

        System.out.println("BY SWITCH");
        switch(selection) {
            case 0:
                System.out.println("Selection 0");
                break;
            case 1:
                System.out.println("Selection 1");
                break;
            case 2:
                System.out.println("Selection 2");
                break;
            default:
                System.out.println("Selection not available");
                break;
        }

        selection = 1;
        switch(selection) {
            case 0:
                System.out.println("Selection 0");
                break;
            case 1:
            case 2:
                System.out.println("Selection 2");
                break;
            default:
                System.out.println("Selection not available");
                break;
        }

        // ELVIS OPERATOR
        int aValor = 5;
        String resultado = aValor > 3 ? "Mayor que 3" : "Menor que 3";
        boolean isMayor3 = aValor > 3 ? aValor > 5 ? true : false : false;

        // expresion ? si true : si false;

        if (aValor > 3) {
            resultado = "Mayor que 3";
        } else {
            resultado = "Menor que 3";
        }

        System.out.println(resultado);
    }
}
