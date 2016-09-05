package com.brainacad.module_1.LabWork_1_4;

/**
 * Created by a.zemlyanskiy on 01.09.2016.
 * Write a console program that prints result type casting for different primitive types.
 */
public class Lab_Work_1_4_8 {
    public static void main(String[] args) {

        double aDoubleValue = 30000000000000000000.123438934;
        int doubleToInt = (int) aDoubleValue;
        byte doubleToByte = (byte) aDoubleValue;
        short doubleToShort = (short) aDoubleValue;
        long doubleToLong = (long) aDoubleValue;
        float doubleToFloat = (float) aDoubleValue;
        char doubleToChar = (char) aDoubleValue;

        System.out.println("doubleToInt : " + doubleToInt);
        System.out.println("doubleToByte : " + doubleToByte);
        System.out.println("doubleToShort : " + doubleToShort);
        System.out.println("doubleToLong : " + doubleToLong);
        System.out.println("doubleToFloat : " + doubleToFloat);
        System.out.println("doubleToChar : " + doubleToChar);
    }
}
