package com.brainacad.module_1.LabWork_1_5;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * The program must print the first 10 numbers that is divisible evenly by 3 or 4 , but the for loop iterates from 1 to 300. (so break statement must be used after 10 printed result).
 * The output shall look: 3 4 ... 20
 */
public class Lab_Work_1_5_4 {
    public static void main(String[] args) {
        int i = 1;
        int n = 0;

        while (i < 300) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                n++;
            }
            i++;
            if (n == 10) {
                break;
            }
        }
    }
}
