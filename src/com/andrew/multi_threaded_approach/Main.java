package com.andrew.multi_threaded_approach;


import static com.andrew.multi_threaded_approach.Bank.total;

public class Main {
    public static void main(String[] args) {
        // Declaring an object of Bank class and passing the
        // object along with other parameters to the
        // ThreadWithdrawal and ThreadDeposit class. This
        // will be required to call withdrawn and deposit
        // methods from those class

        System.out.println("Initial deposit: " + total);
        // Creating an object of class1
        Bank obj = new Bank();
        ThreadWithdrawal t1 = new ThreadWithdrawal(obj,"Angel", 20);
        ThreadWithdrawal t2 = new ThreadWithdrawal(obj, "Ben", 40);
        ThreadDeposit t3 = new ThreadDeposit(obj, "Chloe", 35);
        ThreadWithdrawal t4 = new ThreadWithdrawal(obj, "David", 80);
        ThreadWithdrawal t5 = new ThreadWithdrawal(obj, "Eddy", 40);

        // When a program calls the start() method, a new
        // thread is created and then the run() method is
        // executed.

        // Starting threads created above
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
