package com.andrew.multi_threaded_approach_synchronize;

// Deposit method is called from ThreadDeposit class using
// the object of Bank class passed from the main method*/

// Class 2
// Helper class extending Thread class
public class ThreadDeposit extends Thread {

    Bank object;
    String name;
    int dollar;

    ThreadDeposit(Bank ob, String name, int money)
    {
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    public void run() {
        object.deposit(name, dollar);
    }

}
