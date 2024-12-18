package com.tictactoc.Game;

import com.tictactoc.models.*;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Board board ;
    Deque<Player> players ;


    public Game(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();

        PieceX pieceX = new PieceX();
        PieceO pieceO = new PieceO();
        //Creating Two Players
        Player player1 = new Player("Player 1" , pieceX);
        Player player2 = new Player("Player 2" , pieceO);

        players.add(player1);
        players.add(player2);
        //board Initialize
        board = new Board(3);
    }

    public String startGame(){
        while(true){
            //get First Player
            Player playerTurn = players.removeFirst();

            ArrayList<int[]> freeSlots = board.getFreeCell();

            //draw
            if(freeSlots.isEmpty()){
                break ;
            }

            System.out.println("Player : " + playerTurn.getName() + " Enter row , column : ");
            Scanner sc = new Scanner(System.in) ;
            int row = sc.nextInt();
            int col = sc.nextInt();


            Boolean checkifAdded = board.addPiece(row , col , playerTurn.getPiece());
            if(!checkifAdded){
                System.out.println("Invalid Move");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            boolean winner = gotWinner(row , col , playerTurn.getPiece());
            if(winner){
                return playerTurn.getName();
            }
        }

        return "Match Draw";
    }

    private boolean gotWinner(int row, int col, PlayingPiece piece) {
        boolean rowMatch = true ;
        boolean columnMatch = true ;
        boolean diagonalMatch = true ;

        for(int i=0 ; i<board.getSize() ; i++){
            if(board.getBoard()[row][i] == null || board.getBoard()[row][i]!=piece){
                rowMatch = false ;
            }
        }

        for(int i=0 ; i<board.getSize() ; i++){
            if(board.getBoard()[i][col] == null || board.getBoard()[i][col]!=piece){
                rowMatch = false ;
            }
        }

        for(int i=0 , j= 0  ; i <board.getSize() ; i++ , j++){
            if(board.getBoard()[i][j]==null || board.getBoard()[i][j] != piece){
                diagonalMatch=false ;
            }
        }

        return rowMatch || columnMatch || diagonalMatch  ;
    }

}
