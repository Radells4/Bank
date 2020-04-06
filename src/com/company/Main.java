package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        Account account=new Account(200000);
        System.out.println("Begin balance:"+account.getBalance());
    }
}
enum TYPE{
    USER,
    BILL,
}
enum BILL_TYPE{
    DEPOSIT,
    REMOVE,
    INSERT,
    CLOSE,
    OPEN
}
enum USER_TYPE{
    REGISTER,
    EDIT,
    BLOCK,
}
class Account{
    private double balance;

    public Account(double amount)
    {
        this.balance = amount;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
        else
            System.out.println("Неверное значение для зачисления.");
    }
    public void withdraw(double amount)
    {
        if(amount>0&&balance>amount)
        {
            balance-=amount;
        }
        else
            System.out.println("Неверное значение для снятия");
    }

    public double getBalance() {
        return balance;
    }
}
class T1 extends Thread{
    final Account Account;
    public T1(Account A)
    {
        Account = A;
    }
    @Override
    public void run()
    {
        for(int i=0;i<10000;i++)
        {
            Account.deposit(1);
        }
    }
}
class T2 extends Thread{
    final Account Account;
    public T2(Account A)
    {
        Account = A;
    }
    @Override
    public void run()
    {
        for(int i=0;i<10000;i++)
        {
            Account.withdraw(1);
        }
    }
}
