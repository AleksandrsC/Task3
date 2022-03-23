package com.accenture.bootcamp.task3;
import java.io.PrintStream;
import java.math.BigDecimal;
/**
 * create a class "BankAccount" with property "balance" (should be decimal number)
 *
 */
public class BankAccount {
    private BigDecimal balance;
    private PrintStream out=System.out;//for future extensibility

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
        balance=balance.add(new BigDecimal(amount.toString()));
    }
    /**
     *     create a method "withdraw" with one parameter "amount"
     *         (decimal number) which allows user to decrease the balance.

     */
    public void withdraw(Number amount){
        BigDecimal amt=new BigDecimal(amount.toString());
        if(balance.compareTo(amt)<0){
            out.println("There is not enough funds.");
        }else
            balance=balance.subtract(amt);
    }


    /**
     * create a method "printBalance" which displays the current balance to user
     */
    public void printBalance(){
        out.println("balance:"+balance);
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


    public void setOutput(PrintStream out) {
        this.out = out;
    }
}
