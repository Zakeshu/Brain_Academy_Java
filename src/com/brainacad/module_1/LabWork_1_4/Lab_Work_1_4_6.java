package com.brainacad.module_1.LabWork_1_4;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a console program that prints result of Bitwise operators for two integer variables.
 */
public class Lab_Work_1_4_6 {
    public static void main(String[] args) {
        int a = 0x000F;
        int b = 0x2222;

        System.out.println(Integer.toBinaryString(b & a));
        System.out.println(Integer.toBinaryString(b ^ a));
        System.out.println(Integer.toBinaryString(b | a));
        System.out.println(Integer.toBinaryString(~a));
    }
}
