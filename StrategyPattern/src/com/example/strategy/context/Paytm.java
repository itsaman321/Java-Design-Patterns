package com.example.strategy.context;

public class Paytm implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay Through Paytm");
    }
}
