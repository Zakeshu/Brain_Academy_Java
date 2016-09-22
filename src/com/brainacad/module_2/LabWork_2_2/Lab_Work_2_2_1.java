package com.brainacad.module_2.LabWork_2_2;

import java.util.Random;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Create class Matrix with 2D array (int, size 2x2) field and methods: addition and multiplication of matrices;
 */
public class Lab_Work_2_2_1 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] matrix = new int[2][2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print( matrix[i][j] + "- ");
            }
            System.out.println();
        }



    }

    public int addition() {
        return 0;
    }

    public int multiplication() {
        return 0;
    }

}