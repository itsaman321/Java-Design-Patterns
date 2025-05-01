package com.trello.main;
import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class Board {
    int id ;
    String name ;
    List<ItemList> lists ;
    List<User> users ;

    public Board(String name) {
        this.id = RandomGenerator.getDefault().nextInt() ;
        this.name = name ;
        this.lists = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public Board(String name, List<ItemList> lists, List<User> users) {
        this.id = RandomGenerator.getDefault().nextInt() ;
        this.name = name;
        this.lists = lists;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemList> getLists() {
        return lists;
    }

    public void setLists(List<ItemList> lists) {
        this.lists = lists;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    void addMember(User user){
        users.add(user);
    }

    void moveCard(int cardId , int listId) {
        ItemList toList = lists.stream().filter((e)->e.getId() == listId).findFirst().orElse(null) ;
        ItemList fromList = lists.stream().filter((e)-> e.getCards().stream().filter((c)->c.getId()==cardId).isParallel()).findFirst().orElse(null) ;
        ItemCard card = fromList.getCardById(cardId) ;
        toList.addCard(card);
    }

}
