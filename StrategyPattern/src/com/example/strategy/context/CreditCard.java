package com.example.strategy.context;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay through Credit Card");
    }
}
