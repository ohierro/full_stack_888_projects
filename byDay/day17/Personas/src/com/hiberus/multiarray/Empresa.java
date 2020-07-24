package com.hiberus.multiarray;

public class Empresa {
    Persona[] trabajadores = new Persona[50];

    public void altaPesona(String name, int years, char gender) {
        Persona persona = new Persona(name, years, gender);
        trabajadores[0] = persona;
    }
}
