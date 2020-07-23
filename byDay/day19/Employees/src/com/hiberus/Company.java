package com.hiberus;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList = new ArrayList<>();

    public void add(Employee empleado) {
        empleado.setId(employeeList.size() + 1);
        employeeList.add(empleado);
    }

    public void printAll() {
        for (Employee empleado : employeeList) {
            System.out.println(empleado);
        }
    }

    public int size() {
        return employeeList.size();
    }

    public int totalSalary() {
        int totalSalary = 0;

        for (Employee empleado : employeeList) {
            totalSalary += empleado.getSalary();
        }
//        for (int i = 0; i < employeeList.size(); i++) {
//            Employee empleado = employeeList.get(i);
//            totalSalary += empleado.getSalary();
//        }

        return totalSalary;
    }

    public void raiseGlobal(int percentage) {
        for (Employee empleado : employeeList) {
            empleado.raiseSalary(percentage);
        }
    }
}
