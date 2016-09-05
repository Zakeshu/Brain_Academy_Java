package com.brainacad.module_2.LabWork_2_17;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Create new project called  TestThread2.
 * Add package “com.brainacad.oop.testthread2”.
 * In this exercise, you will create a simple counting thread. It will count to 10, pausing
 * one second between each number. Also, in keeping with the counting theme, it will
 * output a string every ten numbers.
 * 1. Create a class MySumCount which extends the Thread class.
 * 2. Add to class  MySumCount  two integer fields “startIndex” and “stopIndex” with setters and getters.
 * 3. Add to class  MySumCount  new field as array of integer type and setter for it;
 * 4. Add to class  MySumCount  new field “resultSum” of long type and getter for it;
 * Override the run()  method of Thread. Add code to calculate sum of array elements from startIndex to stopIndex and save result to resultSum field.
 * Create a class Main with a main( ) method.
 * Add to method main() code that declares local variable “myArray” as array of integer type (of 1000 size), and create two instancees of MySumCount.
 * Add code to fill all elements of myArray with random integer values generated from 0 to 1000 range.
 * Add code to calculates sum of myArray elements in two separate thread and then print result to console.
 * Execute the program.
 * The program output must be like next example:
 * [324,234,523,…,643]
 * Sum of array elements: 123457
 */
public class Lab_Work_2_17_3 {
}
