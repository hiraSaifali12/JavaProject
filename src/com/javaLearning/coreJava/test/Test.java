package com.javaLearning.coreJava.test;

public class Test {
    public static void main(String[] args){
        BankAccount bn = new BankAccount();
        bn.setAccountNumber(1234);
        bn.Deposite(1002);
        bn.Withdraw(80);


        System.out.println(bn.getBalance());
    }
}
