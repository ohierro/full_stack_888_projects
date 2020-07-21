package com.hiberus.multiarray;

public class Main {

    public static void main(String[] args) {
        MultiArrayFloats multiArray = new MultiArrayFloats();
        multiArray.draw();

        MultiArrayBoolean multiArrayBoolean = new MultiArrayBoolean();
        multiArrayBoolean.draw();

        MultiArrayLines multiArrayLines = new MultiArrayLines();
        multiArrayLines.draw();

        MultiArrayAbsolute multiArrayAbsolute = new MultiArrayAbsolute();
        multiArrayAbsolute.draw();

        MultiArraySuma multiArraySuma = new MultiArraySuma();
        multiArraySuma.draw();
    }
}
