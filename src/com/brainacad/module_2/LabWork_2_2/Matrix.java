package com.brainacad.module_2.LabWork_2_2;


/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Create class Matrix with 2D array (int, size 2x2) field and methods: addition and multiplication of matrices;
 */
public class Matrix {
    public static int n = 2;
    public static int count = 0;


    public static void main(String[] args) {
        int[][] matrix_A = randomGenerateMatrix();
        int[][] matrix_B = randomGenerateMatrix();
        System.out.println(additionMatrix(matrix_A, matrix_B));
        System.out.println(multiplicationMatrix(matrix_A, matrix_B));
    }


    public static int[][] randomGenerateMatrix() {

        int i, j;
        int[][] matrix = new int[n][n];

        if (count == 1) {
            System.out.println("Матрица matrix_B:");

        } else {
            count++;
            System.out.println("Матрица matrix_A:");
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * n * 10);
                System.out.print(matrix[i][j] + (j == n - 1 ? "\n" : "\t"));
            }
        }
        return matrix;
    }

    public static int[][] additionMatrix(int[][] matrix_A, int[][] matrix_B) {
        int[][] matrix_C = new int[n][n];
        System.out.println("Сумма матриц matrix_A и matrix_B :");
        for (int i = 0; i < n; i++)

        {
            for (int j = 0; j < n; j++) {
                matrix_C[i][j] = matrix_A[i][j] + matrix_B[i][j];
                System.out.print(matrix_C[i][j] + (j == n - 1 ? "\n" : "\t"));
            }
        }
        return matrix_C;
    }

    public static int[][] multiplicationMatrix(int[][] matrix_A, int[][] matrix_B) {

        int[][] matrix_C = new int[n][n];

        System.out.println("Произведение матриц matrix_A и matrix_B :");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix_C[i][j] += matrix_A[i][k] * matrix_B[k][j];
                }
                System.out.print(matrix_C[i][j] + (j == n - 1 ? "\n" : "\t"));
            }
        return matrix_C;
    }
}
//
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