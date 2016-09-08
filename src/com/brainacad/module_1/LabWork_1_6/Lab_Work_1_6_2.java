package com.brainacad.module_1.LabWork_1_6;

import java.util.Arrays;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * There are statistics for the year by months as an array:
 * int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * Write code which calculates the maximum value from the array, the minimum value, the average and the median.
 */
public class Lab_Work_1_6_2 {


    public static double median(int[] array) {

        int median = array.length / 2;
        Arrays.sort(array);
        if (array.length % 2 == 1) {
            return array[median];
        } else {
            return (array[median - 1] + array[median]) / 2.0;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int maximum = 0;
        int minimum = array[0];
        int average = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
            if (array[i] < minimum) {
                minimum = array[i];
            }

            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("maximum: " + maximum);
        System.out.println("minimum: " + minimum);
        System.out.println("average: " + average);
        System.out.println("median: " + median(array));
    }
}

