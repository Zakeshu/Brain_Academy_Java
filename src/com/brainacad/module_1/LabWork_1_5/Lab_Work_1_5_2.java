package com.brainacad.module_1.LabWork_1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a program which prompts user for the number "X", reads it from the
 * keyboard, and saves it in an int variable called "x".
 * Then prints "One", "Two",... , "Nine" if the int variable "x" is 1, 2,... , 9 and
 * "Other" if “x” >9, respectively.
 * Use (a) a "nested-if" statement;
 * b) a "switch-case" statement.
 * The output shall look like (user input – in green):
 * -Enter number x: 1	-Enter number x: 12
 * -One					- Other
 */
public class Lab_Work_1_5_2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        String number;

        if(x > 9 || x < 1)  {
            System.out.print("Other");
        }
        switch (x) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
//            default:
//                System.out.print("Other");
//                break;
        }
    }
}
