package com.example.main.addons;

import com.example.main.BaseCoffee;

public class Milk extends AddOnDecorator{
    BaseCoffee baseCoffee ;

    public Milk(BaseCoffee baseCoffee){
        this.baseCoffee = baseCoffee ;
    }

    @Override
    public int cost(){
        return baseCoffee.cost() + 20 ;
    }
}
