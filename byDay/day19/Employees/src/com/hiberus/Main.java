package com.hiberus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee(0, "John", "Wayne", 1000);
        System.out.println(john);
        System.out.println(john.getAnnualSalary());

        System.out.println("Antes cobraba: " + john.getSalary());
        john.raiseSalary(10);
        System.out.println("Ahora cobra: " + john.getSalary());

        System.out.println(john);
        System.out.println(john.getSalary());
        System.out.println(john.getAnnualSalary());

        Employee rango = new Employee(0, "Rango", "Durango", 950);

        Company farWest = new Company();
        farWest.add(john);
        farWest.add(rango);

        farWest.printAll();
        int totalSalary = farWest.totalSalary();
        System.out.println("Mensual salary: " + totalSalary);

        farWest.raiseGlobal(30);
        farWest.printAll();
    }
}
