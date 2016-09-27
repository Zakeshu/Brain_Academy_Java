package com.brainacad.module_2.LabWork_2_1;

/**
 * Created by a.zemlyanskiy on 20.09.2016.
 */
public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

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

        this.price = price * 1.1f;
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


    public void view() {
        System.out.println("\nmanufacturer: " + getManufacturer());
        System.out.println("serialNumber:  " + getSerialNumber());
        System.out.println("price: " + getPrice());
        System.out.println("quantityCPU: " + getQuantityCPU());
        System.out.println("frequencyCPU: " + getFrequencyCPU());
    }
}

