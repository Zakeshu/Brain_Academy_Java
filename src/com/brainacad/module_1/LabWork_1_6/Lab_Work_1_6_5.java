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
        int count = 1, indexNumber;
        int[][] array = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + count++ + ": [");

            for (int j = 0; j <= array.length; j++) {
                if (number == array[i][j]) {
                    indexNumber = j;
                    System.out.print(" " + indexNumber + " ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
/*
    int[][] array = new int[5][5];
    int key = 1;
    int lineNumber = 1;

    Random rnd = new Random();

for (int i = 0; i < array.length; i++)
        {
        for (int j = 0; j < array.length; j++)
        {
        array[i][j] = rnd.nextInt(10);
        }
        }

        for (int[] x : array)
        {
        System.out.print("| ");

        for (int y : x)
        {
        System.out.print(y + " | ");
        }
        System.out.println();
        }

        for (int[] line : array)
        {
        String delimiter = "";
        String message = "";
        int count = 0;
        boolean print = false;

        for (int i = 0; i < line.length; i++)
        {
        if (line[i] == key)
        {
        delimiter = (count > 0 && count < 4) ? "," : "";
        message += delimiter + String.valueOf(i);
        print = true;
        count++;
        }
        }
        if (print)
        {
        System.out.println("Line " + lineNumber + ": [" + message + "]");
        }
        lineNumber++;
        } */
