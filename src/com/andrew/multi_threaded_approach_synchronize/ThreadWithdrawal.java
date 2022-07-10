package com.andrew.multi_threaded_approach_synchronize;

public class ThreadWithdrawal extends Thread {

    // Attributes of this class
    Bank object;
    String name;
    int dollar;

    // Constructor of this class
    ThreadWithdrawal(Bank ob, String name, int money) {

        // This keyword refers to parent class
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    // run() method for the thread
    public void run() {
        object.withdrawn(name, dollar);
    }

}
