package com.brainacad.module_1.LabWork_1_4;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a console program that prints result of each of arithmetic logical
 * (AND,OR,NOT,XOR) for two variables of boolean data type.
 */
public class Lab_Work_1_4_3 {
    public  static void main (String[] args){

        boolean a = false, b = true;

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a ^ b = " + (a ^ b));
    }
}
