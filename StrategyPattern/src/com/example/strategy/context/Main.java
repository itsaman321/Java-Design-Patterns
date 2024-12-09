package com.example.strategy.context;

public class Main {

    public static void main(String[] args){
        User user  = new User(new GooglePay());
        user.doPayment();
    }
}
