package com.accenture.bootcamp.task3;

public class Main {

    public static void main(String[] args) {
	// Bank demo/test*****************************************
        System.out.println("BankAccount demo");
        BankAccount a=new BankAccount(2000);
        BankAccount b=new BankAccount(2000);
        //
        System.out.println("account A");
        a.printBalance();
        System.out.println("account B");
        b.printBalance();
        //
        System.out.println("deposit A 1000.1");
        a.deposit(1000.1);
        System.out.println("account A");
        a.printBalance();
        //
        System.out.println("deposit A 7000.1");
        a.deposit(7000.1);
        System.out.println("account A");
        a.printBalance();
        //
        System.out.println("withdraw A 700.1");
        a.withdraw(700.1);
        System.out.println("account A");
        a.printBalance();
        //
        System.out.println("withdraw A 700000");
        a.withdraw(700000);
        System.out.println("account A");
        a.printBalance();
        //
        System.out.println("transfer B to A 10");
        a.transferFrom(b,10);
        System.out.println("account A");
        a.printBalance();
        System.out.println("account B");
        b.printBalance();
        //
        System.out.println("transfer B to A 10000");
        a.transferFrom(b,10000);
        System.out.println("account A");
        a.printBalance();
        System.out.println("account B");
        b.printBalance();
        // Car demo/test **************************************







    }
}
