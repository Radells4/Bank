package com.company;

import java.util.Random;
import java.util.Scanner;
import com.company.User;

public class Bill {
    Bill next;
    double balance;
    String number;
    String pin;
    com.company.User user;

    public Bill(User user,double balance,int num) {
        Random R = new Random(System.currentTimeMillis());
        pin = String.format("%04d",R.nextInt(10000));
        number = String.format("%04d %04d %04d %04d",R.nextInt(10000),R.nextInt(10000),R.nextInt(10000),R.nextInt(10000));
        this.user=user;
    }
    public double getBalance(double balance) {
        this.balance=balance;
        return balance;
    }
    public double deposit(double balance){
        this.balance=balance;
        Scanner scan = new Scanner(System.in);
        this.balance+=scan.nextDouble();
        return balance;
    }
    public double withdraw(double balance){
        this.balance=balance;
        Scanner scan = new Scanner(System.in);
        this.balance+=scan.nextDouble();
        return balance;
    }
}