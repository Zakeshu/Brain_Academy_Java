package com.brainacad.module_2.LabWork_2_17;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Create new project called  TestThread5.
 * Add package “com.brainacad.oop.testthread5”.
 * a) Write a program in which one thread increments an integer 1,000,000 times, and a second thread prints the integer ( without waiting for it to finish).
 * b) Now modify the program to use a condition variable to signal completion of the addition task by the first thread before the second thread prints the value (using Wait/Notify Mechanism).
 * Implement  three classes: Storage, Counter, and Printer. The Storage class should store an integer. The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and stores each value in the Storage class. The Printer class should create a thread that keeps reading the value in the Storage class and printing it.
 * Write a program that creates an instance of the Storage class and sets up a Counter and a Printer object to operate on it. Modify the program from the previous exercise to ensure that each number is printed exactly once, by adding suitable synchronization.
 * Execute the program.
 * The program output must be like next example:
 * 0
 * 1
 * 2
 * 3
 * ...
 * 999999
 */
public class Lab_Work_2_17_6 {
}
