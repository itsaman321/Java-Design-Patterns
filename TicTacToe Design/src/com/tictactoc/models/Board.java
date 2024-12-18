package com.tictactoc.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size ;
    PlayingPiece[][] board ;

    public Board(int size){
        this.board = new PlayingPiece[size][size];
        this.size = size ;
    }

    public ArrayList<int[]> getFreeCell(){
        ArrayList<int[]> arr = new ArrayList<>();
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j <size ; j++){
                if(board[i][j]==null){
                    arr.add(new int[]{i, j}) ;
                }
            }
        }
        return arr ;
    }

    public Boolean addPiece(int row, int col, PlayingPiece piece) {
        if(board[row][col] != null){
            return false ;
        }
        board[row][col] = piece ;
        return true ;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(PlayingPiece[][] board) {
        this.board = board;
    }
}
