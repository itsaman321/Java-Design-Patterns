package com.trello.main;

import java.util.List;

public class ItemList {
    int id ;
    String name ;
    List<ItemCard> cards ;

    public ItemList(int id, List<ItemCard> cards, String name) {
        this.id = id;
        this.cards = cards;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemCard> getCards() {
        return cards;
    }

    public void setCards(List<ItemCard> cards) {
        this.cards = cards;
    }

    void addCard(ItemCard itemCard){
        cards.add(itemCard) ;
    }

    void deleteCard(int itemCardId){
        cards.remove(cards.stream().filter((e)->e.getId()==itemCardId).findFirst().orElse(null));
    }

    void assignMemberToCard(User user , ItemCard card){
        card.setAssignedUser(user);
    }


    ItemCard getCardById(int card){
        return cards.stream().filter((e)->e.getId()==card).findFirst().orElse(null);
    }

}
