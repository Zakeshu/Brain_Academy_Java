package com.brainacad.module_2.LabWork_2_2;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Create class Matrix with 2D array (int, size 2x2) field and methods: addition and multiplication of matrices;
 */
public class Lab_Work_2_2_1 {
    public int matriks[][];
    public int razmer;

    Lab_Work_2_2_1(int n) {
        razmer = n;
        int[][] matriks = new int[n][n];

        /*Вводятся случайные значения*/

        for (int i = 0; i < matriks.length; i++)
            for (int j = 0; j < matriks[i].length; j++)
                matriks[i][j] = (int) (Math.random() * 100);
        /*Вывод элементов*/
        System.out.println("Случайное заполнение матрицы: ");
        for (int i = 0; i < matriks.length; i++) {
            {
                for (int j = 0; j < matriks[i].length; j++) {
                    System.out.print(matriks[i][j] + "   ");
                }
            }
            System.out.println();

        }
    }

    /*Метод сумма матриц*/
    public Lab_Work_2_2_1 sum(Lab_Work_2_2_1 m1, Lab_Work_2_2_1 m2) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++)
                m1.matriks[i][j] = m1.matriks[i][j] + m2.matriks[i][j];
        }
        return m1;
    }
}

/*второй класс создание матриц*/
class matr {
    public static void main(String[] args) {
        String nam = JOptionPane.showInputDialog("Введите размерность матрицы:");
        int m = Integer.parseInt(nam);
        System.out.println("Размерность матрицы = " + m + " на " + m);
        Lab_Work_2_2_1 m1 = new Lab_Work_2_2_1(m);
        Lab_Work_2_2_1 m2 = new Lab_Work_2_2_1(m);

//        m1.sum(m1, m2);
        System.out.println(m1.sum(m1, m2));
    }
}


//    public static int addition(int[][] matrix_A, int[][] matrix_B) {
//            return 0;
//    }
//
//
//    public int multiplication() {
//        return 0;
//    }
//
//}

//---
//n - размерность матриц
//int n = 2;
//    int[][] A,B,C;
//A = new int[n][n];
//        B = new int[n][n];
//        C = new int[n][n];
//        int i,j,k;
//        //заполняем рандомными значениями матрицы А и В
//        System.out.println("Матрица А:");
//        for(i = 0; i < n; i++){
//        for(j = 0; j < n; j++){
//        A[i][j] = (int)(Math.random() * n * 10);
//        System.out.print(A[i][j] + (j == n - 1?"\n":"\t"));
//        }
//        }
//        System.out.println("Матрица B:");
//        for(i = 0; i < n; i++){
//        for(j = 0; j < n; j++){
//        B[i][j] = (int)(Math.random() * n * 10);
//        System.out.print(B[i][j] + (j == n - 1?"\n":"\t"));
//        }
//        }
//        //складываем матрицы А и В
//        System.out.println("Сумма матриц A и B:");
//        for(i = 0; i < n; i++){
//        for(j = 0; j < n; j++){
//        C[i][j] = A[i][j] + B[i][j];
//        System.out.print(C[i][j] + (j == n - 1?"\n":"\t"));
//        }
//        }
//        //вычитаем матрицу В из матрицы А
//        System.out.println("Разность матриц A и B:");
//        for(i = 0; i < n; i++){
//        for(j = 0; j < n; j++){
//        C[i][j] = A[i][j] - B[i][j];
//        System.out.print(C[i][j] + (j == n - 1?"\n":"\t"));
//        }
//        }
//        }