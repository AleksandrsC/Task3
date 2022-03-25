package com.accenture.bootcamp.task3;

import java.util.Arrays;

public class Main {

    public static int[] simpleArrayCopy (int[] source){
        int[] rv=new int[source.length];
        int idx=0;
        for(int i:source){
            rv[idx++]=i;
        }
        return rv;

    }
    public static int[][] multTable(){
        int[][] rv=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                rv[i][j]=(i+1)*(j+1);
            }//for j
        }//for i
        return rv;
    }
    public static void printAsMultTable(int[][] table){
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                System.out.print(" "+(i+1)+"*"+(j+1)+"="+table[i][j]);
            }//for j
            System.out.println();
        }//for i
    }
    public static void main(String[] args) {
        // mult tables
        int[][] table=multTable();
        System.out.println("multiplication table demo");
        printAsMultTable(table);

        //Array demo --------------
        int[] test={1,5,7,4};
        int[] copy=simpleArrayCopy(test);
        System.out.println("Arrays demo 2");
        System.out.println("Orig array"+ Arrays.toString(test));
        System.out.println("Copied array"+ Arrays.toString(copy));
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
        Car theCar=new VWGolfMk810TSI();
        System.out.println("Car demo");
        System.out.println("Here's our car:"+theCar);
        theCar.shiftUp();
        System.out.println("After up-shift:"+theCar);
        System.out.println("Current heading:"+theCar.getDirection()+ ", speed:"+theCar.getSpeed());
        theCar.setSpeed(10);
        theCar.steer(10);
        System.out.println("After speed set to 10 m/s and 10 degree right turn");
        System.out.println("Current heading:"+theCar.getDirection()+ ", speed:"+theCar.getSpeed());
        theCar.reverse();
        System.out.println("After reverse");
        System.out.println("Current heading:"+theCar.getDirection()+ ", speed:"+theCar.getSpeed());




    }
}
