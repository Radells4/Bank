package com.company;
import java.io.Serializable;
import java.util.UUID;
public class User implements Serializable{
    String Name;
    int Age;
    String Phone;
    String Passport;
    String Password;
    UUID Uuid;

    public User(String name, int age, String phone, String passport, String password) {
        Name = name;
        Age = age;
        Phone = phone;
        Passport = passport;
        Password = password;
        Uuid = UUID.randomUUID();
    }}