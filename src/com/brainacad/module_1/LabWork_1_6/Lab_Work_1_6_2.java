package com.brainacad.module_1.LabWork_1_6;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * There are statistics for the year by months as an array:
 * int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * Write code which calculates the maximum value from the array, the minimum value, the average and the median.
 */
public class Lab_Work_1_6_2 {
    public static void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int maximum = 0;
        int minimum = m[0];
        int average = 0;
        int median = 0;
        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] > maximum) {
                maximum = m[i];
            }

            if (m[i] < minimum) {
                minimum = m[i];
            }

            sum += m[i];
            average = sum/ m.length;

        }


        System.out.println("maximum: " + maximum);
        System.out.println("minimum: " + minimum);
        System.out.println("average: " + average);
        System.out.println("median: " + median);


    }
}

