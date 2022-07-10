package com.andrew.multi_threaded_approach;

import com.andrew.multi_threaded_approach.Bank;

// Method - Withdraw method
// Called from ThreadWithdrawal class
// using the object of Bank class passed
// from the main() method
public class ThreadWithdrawal extends Thread {
    Bank object;
    String name;
    int dollar;

    // Constructor of this method
    ThreadWithdrawal(Bank ob, String name, int money){
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    // run() method for thread
    public void run() { object.withdrawn(name, dollar); }
}
