package com.example.strategy.context;

public class GooglePay implements Payment{
    @Override
    public void pay() {
        System.out.println("thorough Google pay");
    }
}
