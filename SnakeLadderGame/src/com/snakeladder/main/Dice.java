package com.snakeladder.main;

import java.util.random.RandomGenerator;

public class Dice {
    public final static int NO_OF_DICE = 1 ;

    public int rollDice(){
        return RandomGenerator.getDefault().nextInt(1 , (6 * NO_OF_DICE)+ 1 ) ;
    }

}
