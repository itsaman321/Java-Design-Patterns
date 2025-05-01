package com.trello.main;

import java.util.List;
import java.util.Optional;

public class PMService {

    List<Board> boards ;

    public PMService(List<Board> boards) {
        this.boards = boards;
    }

    void addBoard(Board board){
        boards.add(board);
    }

    void deleteBoard(int boardId){
        boards.remove(boards.stream().filter((e)->e.getId()==boardId).findFirst().orElse(null));
    }

    public void showBoard(String s) {
        Optional<Board> board = boards.stream().filter((e)->e.getName().equalsIgnoreCase(s)).findFirst() ;
        if(board.isPresent()){
            System.out.println(board);
        }else{
            System.out.println(s + " does not exist");
        }

    }

    public void showBoard() {
        boards.stream().forEach((e)->System.out.println(e)); ;
    }
}
