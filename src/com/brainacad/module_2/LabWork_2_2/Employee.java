package com.brainacad.module_2.LabWork_2_2;

/**
 * Created by a.zemlyanskiy on 29.09.2016.
 *
 * Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 * This method should calc total salary of employee and print his name and total salary.
 * Write class Accountant that will be create Employee instance and use his method with a different number of data.
 */

public class Employee {
    private String name;
    private double salary;

    public void calcSalary (String name, double... salary ){
//        for(int i = 0; i < salary.length; i++){
//
//        }
        for (double x : salary) {
        }

        System.out.println("Workers name: " + name + "  salary: " + salary );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}


