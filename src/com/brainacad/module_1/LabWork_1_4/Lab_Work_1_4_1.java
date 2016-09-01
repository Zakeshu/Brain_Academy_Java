package com.brainacad.module_1.LabWork_1_4;


/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a console program prints on console each of the primitive data types
 * (byte,short,int,long,float,double,char,boolean).
 */
public class Lab_Work_1_4_1 {
    public static void main(String[] args) {

        byte a = 1;
        short b = -12345;
        int c = 25461545;
        long d = 2147483648L;
        float e = 3.4e+38f;
        double f = 1.7e+308;
        char g = 'A';
        boolean h = true;

        System.out.println("Type byte: " + a);
        System.out.println("Type short: " + b);
        System.out.println("Type int: " + c);
        System.out.println("Type long: " + d);
        System.out.println("Type float: " + e);
        System.out.println("Type double: " + f);
        System.out.println("Type char: " + g);
        System.out.println("Type boolean: " + h);
    }
}