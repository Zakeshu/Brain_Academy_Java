package com.brainacad.module_1.LabWork_1_5;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program to produce the multiplication table of 1 to 9 as shown
 * using two nested for-loops:
 * * |  1  2  3  4  5  6  7  8  9
 * -------------------------------
 * 1 |  1  2  3  4  5  6  7  8  9
 * 2 |  2  4  6  8 10 12 14 16 18
 * 3 |  3  6  9 12 15 18 21 24 27
 * 4 |  4  8 12 16 20 24 28 32 36
 * 5 |  5 10 15 20 25 30 35 40 45
 * 6 |  6 12 18 24 30 36 42 48 54
 * 7 |  7 14 21 28 35 42 49 56 63
 * 8 |  8 16 24 32 40 48 56 64 72
 * 9 |  9 18 27 36 45 54 63 72 81
 */
public class Lab_Work_1_5_3 {
    public static void main(String[] args) {

        System.out.print("* | ");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n—————————————————————— \n");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " |" + "\t");
            for (int j = 1; j < 10; j++) {
                System.out.printf(i * j + "\t");
            }
            System.out.println();
        }
    }
}

