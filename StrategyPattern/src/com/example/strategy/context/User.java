package com.example.strategy.context;

public class User {
    Payment payment ;

    User(Payment payment){
        this.payment = payment ;
    }

    public void doPayment(){
        payment.pay();
    }
}
