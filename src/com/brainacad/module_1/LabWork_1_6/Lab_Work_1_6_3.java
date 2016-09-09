package com.brainacad.module_1.LabWork_1_6;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program, which creates square matrix like those in the figure below and prints them formatted to the console.
 * The size of the matrix is 4 x 4:
 * 1    5   9   13
 * 2    6   10  14
 * 3    7   11  15
 * 4    8   12  16
 */
public class Lab_Work_1_6_3 {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        int lineNumber = 1;


        for (int i = 0; i < array.length; i++) {

            int step = 4;

            for (int j = 0; j < array.length; j++) {
                if (j == 0) {
                    array[i][j] = lineNumber;
                } else {
                    array[i][j] = lineNumber + step;
                    step += 4;
                }
            }
            lineNumber++;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


