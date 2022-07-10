package com.andrew;

import static com.andrew.Bank.total;

public class Main {

    public static void main(String[] args) {
        // Declaring an object of Bank class and calling the
        // withdrawn and deposit methods with suitable
        // parameters

        // Creating object of class 1 inside main()
        Bank obj = new Bank();


        System.out.println("Initial balance: "
        + total);

        // Custom input - Transactions
        obj.withdrawn("Ade", 20);
        obj.withdrawn("Bola", 40);
        obj.deposit("Charles", 35);
        obj.withdrawn("Dickson", 80);
        obj.withdrawn("Emma", 40);

        System.out.println("=======================================================================");

    }
}
