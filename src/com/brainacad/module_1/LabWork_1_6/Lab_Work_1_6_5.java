package com.brainacad.module_1.LabWork_1_6;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program, which finds in a given matrix the area of equal numbers. Here is one example with an area containing 7 elements with equal value of 1:
 * <p>
 * +----------------------------+
 * | 1 | 1 | 1 | 3 | 4 |
 * | 2 | 1 | 3 | 1 | 2 |
 * | 2 | 2 | 3 | 4 | 1 |
 * | 3 | 3 | 3 | 1 | 4 |
 * <p>
 * The program must print to console:
 * Line 1: [0-2]
 * Line 2: [1,3]
 * Line 3: [4]
 * Line 4: [3]
 */
public class Lab_Work_1_6_5 {
    public static void main(String[] args) {

        int number = 1;
        int a = 1, k = 0;
        int[][] m = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}
        };

        for (int i = 0; i < m.length; i++) {
            System.out.print("Line " + a++ + ": [");

            for (int j = 0; j <= m.length; j++) {
                if (number == m[i][j]) {
                   k = j;
                   System.out.print(" " + k + " " );
                }
            }
            System.out.print("]");
            System.out.println();
        }

    }
}

//        Console output:
//
//        Line 1: [ 0  1  2 ]
//        Line 2: [ 1  3 ]
//        Line 3: [ 4 ]
//        Line 4: [ 3 ]
