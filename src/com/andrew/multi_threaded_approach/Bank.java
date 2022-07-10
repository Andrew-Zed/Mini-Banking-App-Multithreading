package com.andrew.multi_threaded_approach;

// Java Program to illustrate Multithreading Approach
// In Banking transaction system

// Class 1
// Helper class
public class Bank {
    // Initial custom balance
    static int total = 100;

    // Money withdrawal method. Withdraw only if total money
    // greater than or equal to the money requested for
    // withdrawal
    void withdrawn(String name, int withdrawal){
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                    + withdrawal);
            total = total - withdrawal;

            System.out.println(total);

            //  Making the thread sleep for 1 second after
            //   each withdrawal

            // Try block to check for exceptions
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Else if the money requested for withdrawal is
        // greater than the balance then deny transaction
        else {
            System.out.println(name + " you can not withdraw " + withdrawal);
            System.out.println(" your balance is " + total);

            // Making the thread sleep for 1 second after
            // each transaction failure

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    // Method - To deposit money
    // Accepting money whenever deposited
    void deposit(String name, int deposit){
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: " + total);

        // Making the thread sleep for 1 second after
        // each deposit

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
