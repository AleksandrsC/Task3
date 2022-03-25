package com.accenture.bootcamp.task3;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * create a class "BankAccount" with property "balance" (should be decimal number)
 *
 */
public class BankAccount {
    private BigDecimal balance;
    private static final BigDecimal DEPOSIT_LIMIT=new BigDecimal("5000");
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
     * @param amount deposit amount
     */
    public void deposit(Number amount){
        BigDecimal amt = new BigDecimal(amount.toString());
        if(amt.compareTo(DEPOSIT_LIMIT)>0) {
            out.println(MessageFormat.format("Transaction cancelled. Max deposit - {0} | Your deposit: {1}", DEPOSIT_LIMIT, amount));
        } else {
            balance = balance.add(amt);
        }
    }
    /**
     *     create a method "withdraw" with one parameter "amount"
     *         (decimal number) which allows user to decrease the balance.

     */
    public void withdraw (Number amount){
        if(!checkAndWithdraw(amount)){
            out.println("There is not enough funds.");
        }
    }

    /**
     *
     * @param amount amount to withdraw
     * @return true if withdraw successful, false if insufficient funds
     */
    private boolean checkAndWithdraw(Number amount){
        BigDecimal amt=new BigDecimal(amount.toString());
        if(balance.compareTo(amt)<0){
            return false;
        }else
            balance=balance.subtract(amt);
        return true;
    }


    /**
     * create a method "printBalance" which displays the current balance to user
     */
    public void printBalance(){
        out.println("balance:"+balance);
    }

    /**
     * method for transfer balance from one bank account to another
     * @param fromAccount account the funds will be withdrawn from
     * @param amount amount to transfer
     */
    public void transferFrom(BankAccount fromAccount, Number amount){

        if (fromAccount.checkAndWithdraw(amount)) {
            deposit(amount);
        }else{
            out.println(MessageFormat.format("Transfer cancelled. You are trying to transfer {0} units, but only {1} are available.", amount, fromAccount.balance));
        }
    }


    public void setOutput(PrintStream out) {
        this.out = out;
    }
}
