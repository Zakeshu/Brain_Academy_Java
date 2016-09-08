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

        for(int i = 0; i < 15; i++) {
            array[i] = value;
            value +=  2;
        }
        for ( int i = 0; i <array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
/**
 *   > > > Вариант № 2 < < <
 *
 *   int[] m = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
 *        System.out.print(m[0] + " ");
 *        System.out.print(m[1] + " ");
 *        System.out.print(m[2] + " ");
 *        System.out.print(m[3] + " ");
 *        System.out.print(m[4] + " ");
 *        System.out.print(m[5] + " ");
 *        System.out.print(m[6] + " ");
 *        System.out.print(m[7] + " ");
 *        System.out.print(m[8] + " ");
 *        System.out.print(m[9] + " ");
 *        System.out.print(m[10] + " ");
 *        System.out.print(m[11] + " ");
 *        System.out.print(m[12] + " ");
 *        System.out.print(m[13] + " ");
 *        System.out.print(m[14] + " ");
 *
 *
 *     > > > Вариант № 3 < < <
 *
 *   int[] m = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
 *      for (int i =0; i <m.length; i++){
 *      System.out.print(m[i] + " ");
 */