package com.snakeladder.main;

import java.util.Deque;
import java.util.Optional;

public class SnakeLadderService {

    public Board board ;

    private Deque<Player> players ;

    public SnakeLadderService(Board board , Deque<Player> players){
        this.board = board ;
        this.players = players;
    }

    public void playGame(){
        Dice dice  = new Dice() ;
        while(!players.isEmpty()){
            Player currentPlayer = players.pollFirst();
            players.addLast(currentPlayer);
            int diceOutcome = dice.rollDice() ;

            int newLocation = board.getPlayersScore().get(currentPlayer.getId()) +  diceOutcome ;

            //If Snake of Ladder Exist
            int finalNewLocation = newLocation;
            Optional<Integer> tail = board.getLadders().stream().filter((e)->e.getHead()== finalNewLocation).map((e)->e.getTail()).findFirst() ;
            if(tail.isPresent()){
                newLocation = tail.get() ;
            }

            tail = board.getSnakes().stream().filter((e)->e.getHead()== finalNewLocation).map(Snake::getTail).findFirst() ;
            if(tail.isPresent()){
                newLocation = tail.get() ;
            }

            if(newLocation<=100){
                System.out.println( currentPlayer.getPlayerName() + " rolled a " + diceOutcome + " and moved from "  +  board.getPlayersScore().get(currentPlayer.getId()) + "  to  " + newLocation);
                if(newLocation==100){
                    players.remove(currentPlayer) ;
                    System.out.println( currentPlayer.getPlayerName() + " Won !");
                    break ;
                }
                board.getPlayersScore().put(currentPlayer.getId() , newLocation) ;
            }else{
                System.out.println( currentPlayer.getPlayerName() + " rolled a " + diceOutcome + " and can't be moved from "  +  board.getPlayersScore().get(currentPlayer.getId()) + "  to  " + newLocation);
            }
        }
    }
}
