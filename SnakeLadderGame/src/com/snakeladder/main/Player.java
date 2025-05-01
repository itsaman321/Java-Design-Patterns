package com.snakeladder.main;

import java.util.random.RandomGenerator;

public class Player {
    int id ;
    String playerName ;

    public Player(String name){
        this.id = RandomGenerator.getDefault().nextInt(10);
        this.playerName = name ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
