package com.brainacad.module_2.LabWork_2_17;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Open  project called  TestThread8.
 * When running the program from lab 2-17-8, you should see that in some cases it fails to work properly (i.e. the total balance of all the accounts is corrupted). This is an example of race condition. Modify your code in order to fix these race conditions.
 * The output should be similar (but not exactly identical) to:
 * from: 1 to: 2 amount: 178
 * Total balance: 5000
 * from: 1 to: 0 amount: 30
 * Total balance: 5000
 * from: 1 to: 0 amount: 47
 * Total balance: 5000
 * ...
 * from: 2 to: 1 amount: 351
 * from: 2 to: 4 amount: 27
 * Total balance: 5000
 * from: 2 to: 3 amount: 78
 * Total balance: 5000
 * from: 2 to: 3 amount: 745
 * from: 2 to: 2 amount: 5
 */

/*
Remind that  student should apply his or her knowledge of:
how to create a Thread and using synchronization;
Execute following steps:
Rewrite the Bank, Transfer and  BankTest classes and  provide all necessary code
 */

public class Lab_Work_2_17_9 {
}
