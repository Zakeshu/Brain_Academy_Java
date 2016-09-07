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
        int counter, num, item, first, last;
        int[] array = {1, 95, 2, 6, 45, 65, 74, 85, 10, 01, 3, 99, 478};

        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        item = Integer.parseInt(reader.readLine());
        first = 0;
        last = array.length - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int count = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            count++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + count +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + count + " сравнений");
        }
    }
}
