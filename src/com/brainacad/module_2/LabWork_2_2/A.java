package com.brainacad.module_2.LabWork_2_2;

/**
 * /**
 * Write class A with overridden methods calcSquare that calculate square of rectangle,
 * square of foursquare and square of circle and print result.
 * Write class that will use these methods.
 * <p>
 * Write class with method that will take final integer and assign to it the square
 * of this integer and print result. What will you get? Explain result.
 * <p>
 * <p>
 * Created by a.zemlyanskiy on 30.09.2016.
 * Создать класс А с Перегруженные методы calcSquare, что вычислить площадь прямоугольника, 
 * Квадрат четвероугольником и квадрат окружности и распечатать результат. 
 * Создать класс, который будет использовать эти методы. 
 * Создать класс с методом, который будет принимать окончательное число и присвоить ему квадрат 
 * * Этого целого и распечатать результат. Что вы получите? Объясните результат. 
 */
public class A {

    public static double calcSquare(int sideOfFoursquare) {
        double res = Math.pow(sideOfFoursquare, 2);
        System.out.println("Площадь квадрата = " + res);
        return res;
    }

    public static double calcSquare(int length, int height) {
        double res = length * height;
        System.out.println("Площадь прямоугольника = " + res);
        return res;
    }

    public static double calcSquare(double radius) {
        double res = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь окружности = " + res);
        return res;
    }
}

class MainForSquare {
    public static void main(String[] args) {
        double rectangle = A.calcSquare(5, 9);
        double foursquare = A.calcSquare(5);
        double circle = A.calcSquare(2.5);

    }
}