package com.brainacad.module_2.LabWork_2_2;

/**
 * Created by a.zemlyanskiy on 29.09.2016.
 *
 * Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 * This method should calc total salary of employee and print his name and total salary.
 * Write class Accountant that will be create Employee instance and use his method with a different number of data.
 */
public class Accountant {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calcSalary("Ivanov", 123.2, 23.5);
    }
}
