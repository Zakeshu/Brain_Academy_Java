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

        int[][] m = {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}
        };

        System.out.println(m[0][0] + " " + m[0][1] + " " + m[0][2] + " " + m[0][3]);
        System.out.println(m[1][0] + " " + m[1][1] + " " + m[1][2] + " " + m[1][3]);
        System.out.println(m[2][0] + " " + m[2][1] + " " + m[2][2] + " " + m[2][3]);
        System.out.println(m[3][0] + " " + m[3][1] + " " + m[3][2] + " " + m[3][3]);

        //        > > > Вариант 2 < < <
//        for (int i = 0; i < m.length; i++) {
//           for(int j=0; j < m.length; j++) {
//               System.out.print (m[i][j] + " " + "\t");
//           }
//            System.out.println ();
//        }
    }
}

