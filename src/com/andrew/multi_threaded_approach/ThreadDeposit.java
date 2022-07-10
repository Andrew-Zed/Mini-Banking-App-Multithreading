package com.andrew.multi_threaded_approach;

import com.andrew.multi_threaded_approach.Bank;

// Deposit method is called from ThreadDeposit class
// using the object of Bank class passed
// from the main method
public class ThreadDeposit extends Thread{
    Bank object;
    String name;
    int dollar;
    ThreadDeposit(Bank ob, String name, int money) {
        // This keyword refers to current instance itself
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    public void run() { object.deposit(name, dollar); }

}
