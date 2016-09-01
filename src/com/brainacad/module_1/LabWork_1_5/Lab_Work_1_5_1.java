package com.brainacad.module_1.LabWork_1_5;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program to produce on console the following :
 * 1
 * 2  1
 * 3 2  1
 * 4 3 2  1
 * 5 4 3 2  1
 * 6 5 4 3 2  1
 * 7 6 5 4 3 2  1
 * 8 7 6 5 4 3 2  1
 */
public class Lab_Work_1_5_1 {
    public static void main  (String[] args) {

        for (int i = 1; i < 9; i++) {
            for (int j = i; j >= 8; j-- ) {
               System.out.println(i);
//                j--;
            }
//            System.out.println(i);
        }
    }
}
