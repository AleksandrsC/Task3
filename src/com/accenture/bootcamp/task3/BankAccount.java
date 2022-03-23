package com.accenture.bootcamp.task3;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.math.BigDecimal;
/**
 * create a class "BankAccount" with property "balance" (should be decimal number)
 *
 */
public class BankAccount {
    private BigDecimal balance;
    public BankAccount(){
        balance=BigDecimal.ZERO;
    }
    public BankAccount(Number initBalance){
        balance=new BigDecimal(initBalance.toString());
    }

    /**
     *      create a method "deposit" with one parameter "amount" (decimal number)
     *      which allows user to increase the balance.
     * @param amount
     */
    public void deposit(Number amount){
        balance=balance.add(new BigDecimal(amt.toString()));
    }
    /**
     *     create a method "withdraw" with one parameter "amount"
     *         (decimal number) which allows user to decrease the balance.

     */
    public void withdraw(Number amount){
        balance=balance.subtract(new BigDecimal(amt.toString()));
    }

    public void printBalance(PrintStream out){
        out.println("balance:"+balance);
    }

    /**
     * create a method "printBalance" which displays the current balance to user
     */
    public void printBalance(){
        printBalance(System.out);
    }

    /**
     * method for transfer balance from one bank account to another
     * @param fromAccount
     * @param amount
     */
    public void transferFrom(BankAccount fromAccount, Number amount){
        fromAccount.withdraw(amount);
        deposit(amount);
    }


}
