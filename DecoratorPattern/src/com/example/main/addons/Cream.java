package com.example.main.addons;

import com.example.main.BaseCoffee;

public class Cream extends AddOnDecorator{
    BaseCoffee baseCoffee ;

    public Cream(BaseCoffee baseCoffee){
        this.baseCoffee = baseCoffee ;
    }

    @Override
    public int cost(){
        return this.baseCoffee.cost() + 10 ;
    }
}
