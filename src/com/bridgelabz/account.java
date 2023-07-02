package com.bridgelabz;

public class account {
    int accountBalance;
    void debit(int debitAmount){
        if (this.accountBalance < debitAmount){
            System.out.println("Debit amount exceeds account balance");
        }
        else {
            this.accountBalance = this.accountBalance - debitAmount;
            System.out.println("remaining balance is " + this.accountBalance);
        }
    }

    public static void main(String[] args) {
        account union = new account();
        union.accountBalance = 10000;
        union.debit(5000);
        union.debit(10000);
}}
