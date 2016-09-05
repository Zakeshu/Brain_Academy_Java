package com.brainacad.module_2.LabWork_2_17;

/**
 * Created by a.zemlyanskiy on 05.09.2016.
 * Create new project called  TestThread8.
 * Add package “com.brainacad.oop.testthread8”.
 * Consider a class "Bank" with a number of accounts. Transactions are randomly generated that move money between these accounts. Several threads simulate the transfer of random amount of money from a given account to another random account.
 * The class "Bank" has a method "transfer", which transfers a given amount from one account to another. A template for the class "Bank" is given in next pages.
 * The first task is to complete the class "Transfer" that transfers a random amount of money from a given account to another random account in a bank (use an infinite loop); this class will be executed by multiple threads concurrently.
 * Complete the code in BankTest  to spawn N_ACCOUNTS "Transfer" threads with an initial balance: INITIAL_BALANCE.
 * The output should be similar (but not exactly identical) to:
 *
 * from: 0 to: 2 amount: 410
 * from: 3 to: 0 amount: 105
 * from: 1 to: 1 amount: 77
 * from: 2 to: 2 amount: 713
 * from: 4 to: 3 amount: 524
 * Total balance: 3581
 * from: 0 to: 4 amount: 927
 * from: 0 to: 4 amount: 768
 * from: 0 to: 1 amount: 647
 * from: 0 to: 0 amount: 539
 * Total balance: 3147
 * from: 3 to: 1 amount: 457
 * Total balance: 3403
 * ...
 * from: 0 to: 4 amount: 633
 * Total balance: 2941
 * rom: 2 to: 3 amount: 662
 * Total balance: 3353
 * from: 3 to: 0 amount: 855
 * Total balance: 2739
 */
/*

Remind that  student should apply his or her knowledge of:
how to create a Thread and using synchronization;
Execute following steps:
Rewrite the Bank, Transfer and  BankTest classes and  provide all necessary code

public class Bank {
    private int accounts[];
    private int numOfAccounts;
    public Bank(int num_accounts, int init_balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = init_balance;
        }
    }
    void transfer(int from, int to, int amount) {
        try {
            System.out.println("from: " + from + " to: " + to +
                    " amount: " + amount);

            if (accounts[from] < amount) return;
            accounts[from] = accounts[from] - amount;
            Thread.sleep((int)(100*Math.random()));
            accounts[to] = accounts[to] + amount;

            System.out.println("Total balance: " + totalBalance());

        } catch (InterruptedException e) {

        }
    }
    public int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total = total + v;
        }
        return total;
    }
    public int getNumberAccounts() {
        return numOfAccounts;
    }
}

public class Transfer {
    private Bank bank;
    private int from;
    private int max;
    public Transfer(Bank bank, int from, int max_amount) {
        bank = bank;
        from = from;
        max = max_amount;
    }
}

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        //...
        // COMPLETE
        //..
    }
}

 */





public class Lab_Work_2_17_8 {
}
