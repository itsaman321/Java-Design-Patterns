package com.snakeladder.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    List<Snake> snakes  ;
    List<Ladder> ladders ;
    HashMap<Integer , Integer> playersScore  ;

    public static int DEFAULT_BOARD_SIZE = 100  ;

    public Board(List<Snake> snakes , List<Ladder> ladders , HashMap<Integer , Integer> map){
        this.snakes = snakes;
        this.ladders = ladders;
        playersScore = map;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public HashMap<Integer, Integer> getPlayersScore() {
        return playersScore;
    }

    public void setPlayersScore(HashMap<Integer, Integer> playersScore) {
        this.playersScore = playersScore;
    }

    public void addLadder(int head , int tail){
        ladders.add(new Ladder(head , tail)) ;
    }

    public void addSnakes(int head , int tail){
        snakes.add(new Snake(head , tail)) ;
    }
}
