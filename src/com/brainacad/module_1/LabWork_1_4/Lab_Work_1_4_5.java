package com.brainacad.module_1.LabWork_1_4;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a console program that prints result of bit shift operators for integer variable.
 */
public class Lab_Work_1_4_5 {
    public  static void main (String[] args){

        int a = 80;
        int b = 5;

        System.out.println(Integer.toBinaryString(b << a));
        System.out.println(Integer.toBinaryString(b >> a));
    }
}
