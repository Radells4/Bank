package com.company;
import com.company.Bill;
import com.company.User;

public class Bank {
    com.company.Bill HEAD;
    int count;

    void insert(double balance,User user) {
        if (HEAD==null){HEAD = new Bill(user,balance,7);}
        else{
            Bill last = HEAD;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Bill(user, balance,7);
        }
    }
}
