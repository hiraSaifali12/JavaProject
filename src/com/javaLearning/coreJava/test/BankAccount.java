package com.javaLearning.coreJava.test;

public class BankAccount {
    private double balance;
   private double accountNumber;

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void Deposite(double amount){
        if(amount>0){
           balance+=amount;
            System.out.println("Deposite :"+amount);
        }
        else{
            System.out.println("invalid Deposite amount");
        }
    }
    public void Withdraw(double amount){
        if(amount>0 && amount<=balance){
         balance-=amount;
            System.out.println("withdraw" + amount);
        }
        else{
            System.out.println("invalid");
        }
    }
}
