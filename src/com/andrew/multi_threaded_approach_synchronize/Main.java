package com.andrew.multi_threaded_approach_synchronize;

public class Main {
    public static void main(String[] args) {

        // Declaring an object of Bank class and passing the
        // object along with other parameters to the
        // ThreadWithdrawal and ThreadDeposit class. This
        // will be required to call withdrawn and deposit
        // methods from those class

        // Creating object of above class inside main()
        Bank obj = new Bank();

        // Creating threads
        ThreadWithdrawal t1 = new ThreadWithdrawal(obj, "Adam", 20);
        ThreadWithdrawal t2 = new ThreadWithdrawal(obj, "Barnabas", 40);
        ThreadDeposit t3 = new ThreadDeposit(obj, "Caesar", 35);
        ThreadWithdrawal t4 = new ThreadWithdrawal(obj, "Damian", 80);
        ThreadWithdrawal t5 = new ThreadWithdrawal(obj, "Elijah", 40);

        // When a program calls the start() method, a new
        // thread is created and then the run() method is
        // executed
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
