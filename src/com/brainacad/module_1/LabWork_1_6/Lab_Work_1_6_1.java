package com.brainacad.module_1.LabWork_1_6;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30)
 * and display elements of the array to the screen.
 */
public class Lab_Work_1_6_1 {
    public static void main  (String[] args) {

        int[] array = new int[15];
        int value = 2;
        int count = 0;
        String separator;

        for(int i = 0; i < 15; i++) {
            array[i] = value;
            value +=  2;
        }
        System.out.print("Array [ ");
        for ( int i = 0; i < array.length; i++){
            separator = (count > -1 && count < (array.length-1)) ? "," : "";
            System.out.print(array[i] + separator + " ");
            count++;
        }
        System.out.println("]");
    }
}