package com.brainacad.module_2.LabWork_2_1;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Write Computer class, the attributes of this class is manufacturer (of String type),
 * serialNumber(of int type), price (of float type), quantityCPU(of int type) and
 * frequencyCPU(of int type).
 */
public class Lab_Work_2_1_1 {
    public static void main(String[] args) {

        Computer[] computer = new Computer[10];

        for (int i = 0; i < computer.length; i++) {
            computer[i] = new Computer();
            float defaultPrice = 10f + i;
            computer[i].setPrice(defaultPrice);
//            System.out.println(computer[i].getPrice());
            computer[i].view();
        }
    }
}

