package com.hiberus.multiarray;

public class Persona {
    private String name;
    private int years;
    private String dni;
    private char gender;
    private int weight;
    private int height;

    public Persona() {}

    public Persona(String name, int years, char gender) {
        this.name = name;
        this.years = years;
        this.gender = gender;
    }

    public Persona(String name, int years, char gender, String dni, int weight, int height) {
        this.name = name;
        this.years = years;
        this.gender = gender;
        this.dni = dni;
        this.weight = weight;
        this.height = height;
    }

    public float getIMC() {
        float alturaEnMetros = (float) height / 100;
        float masa = (float) (weight / Math.pow(alturaEnMetros, 2));
        return masa;
    }

    public String toString() {
        return "Nombre: " + name +
                " Edad: " + years +
                " Género: " + gender;
    }
}
