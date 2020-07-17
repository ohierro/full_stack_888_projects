package com.hiberus.types;

public class Visibilidad {
    private int privateVariable;
    private int privateWithAccesors;

    public int publicVariable;

    public int getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }

    public int getPrivateWithAccesors() {
        return privateWithAccesors;
    }
}
