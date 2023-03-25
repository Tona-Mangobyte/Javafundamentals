package org.example.oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HR {
    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void layOff(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void printEveryBody() {
        employees.forEach(System.out::println);
    }

    public void payEveryBody() {
        for (Employee employee: employees) {
            System.out.printf("Paying %s  $s%n", employee.getName(),
                    NumberFormat.getCurrencyInstance().format(employee.getPay()));
        }
    }
}
