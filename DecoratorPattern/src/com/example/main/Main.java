package com.example.main;

import com.example.main.addons.Cream;
import com.example.main.addons.Milk;
import com.example.main.types.Cappuccino;

public class Main {
    public static  void main(String[] args){
        //Cappuccino with milk
        BaseCoffee baseCoffee = new Milk(new Cappuccino());
        System.out.println(baseCoffee.cost());

        //Cappuccino with milk and Cream
        BaseCoffee baseCoffee2 = new Cream(new Milk(new Cappuccino()));
        System.out.println(baseCoffee2.cost());
    }
}
