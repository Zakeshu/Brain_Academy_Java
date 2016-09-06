package com.brainacad.module_1.LabWork_1_5;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
 * Also compute and display the average. The output shall look like:
 * The Sum is: 100
 * The Avg is: 10
 */
public class Lab_Work_1_5_5 {
    public static void main  (String[] args) {

        int n =14;
        int sum = 0;
        int avg = 0;

        for (int i = 1; i <= n; i++ ) {
            sum += i;
        }

        avg = sum / n;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
    }
}
