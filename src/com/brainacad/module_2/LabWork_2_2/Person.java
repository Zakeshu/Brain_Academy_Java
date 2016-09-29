package com.brainacad.module_2.LabWork_2_2;


/**
 * Create class Person with fields firstName(String), lastName(String), age(int), gender(String),
 * phoneNumber(int), and  five overloaded methods that set this fields with different arguments list.
 * And create class that will be use instance of class Person and his methods.
 */
public class Person {


    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    public int phoneNumber;

    public void overloadedMethodsPerson() {

    }

    public void overloadedMethodsPerson(String firstName, String lastName) {

    }

    public void overloadedMethodsPerson(String firstName, String lastName, int age) {

    }

    public void overloadedMethodsPerson(String firstName, String lastName, int age, String gender) {

    }

    public void overloadedMethodsPerson(String firstName, String lastName, int age, String gender, int phoneNumber) {

    }
}

class Main{
    public static void main(String[] args) {
        Person person = new Person();
        person.overloadedMethodsPerson();
    }
}