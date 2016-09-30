package com.brainacad.module_2.LabWork_2_2;

import java.io.IOException;

/**
 * Created by a.zemlyanskiy on 30.09.2016.
 * Create class Person with fields firstName(String), lastName(String), age(int), gender(String),
 * phoneNumber(int), and  five overloaded methods that set this fields with different arguments list.
 * And create class that will be use instance of class Person and his methods.
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.overloadedMethodsPerson("Alex", "Z", 29, "male", 76514525);
    }


    public static class Person {

        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private int phoneNumber;

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
}