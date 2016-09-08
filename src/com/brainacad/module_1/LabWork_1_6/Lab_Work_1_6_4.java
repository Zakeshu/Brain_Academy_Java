package com.brainacad.module_1.LabWork_1_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.
 */
public class Lab_Work_1_6_4 {
    public static void main(String args[]) throws Exception {
        int item, firstIndex, lastIndex;
        int[] array = {1, 95, 2, 6, 45, 65, 74, 85, 10, 01, 3, 99, 478};

        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        item = Integer.parseInt(reader.readLine());
        firstIndex = 0;
        lastIndex = array.length - 1;
        binarySearch(array, firstIndex, lastIndex, item);
    }

    public static void binarySearch(int[] array, int firstIndex, int lastIndex, int item) {
        int index;
        index = (firstIndex + lastIndex) / 2;

        while ((array[index] != item) && (firstIndex <= lastIndex)) {
            if (array[index] > item) {
                lastIndex = index - 1;
            } else {
                firstIndex = index + 1;
            }
            index = (firstIndex + lastIndex) / 2;
        }
        if (firstIndex <= lastIndex) {
            System.out.println("Element: " + item + " found. Index in array: [" + ++index + "]");

        } else {
            System.out.println("Element not found");
        }
    }
}
