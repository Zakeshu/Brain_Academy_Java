package com.brainacad.module_2.LabWork_2_1;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Write a program to create array of Computer objects (5 pcs.)
 * Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to
 * array (using loop).
 */
public class Lab_Work_2_1_3 {
    public static void main(String[] args) {

        Computer[] computer = new Computer[3];

        for (int i = 0; i < 5; i++) {
            computer[i] = new Computer ();

        }
    }

    static class  Computer {
        public String manufacturer;
        public int serialNumber;
        public float price;
        public int quantityCPU;
        public int frequencyCPU;


        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public int getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getQuantityCPU() {
            return quantityCPU;
        }

        public void setQuantityCPU(int quantityCPU) {
            this.quantityCPU = quantityCPU;
        }

        public int getFrequencyCPU() {
            return frequencyCPU;
        }

        public void setFrequencyCPU(int frequencyCPU) {
            this.frequencyCPU = frequencyCPU;
        }
    }
}

