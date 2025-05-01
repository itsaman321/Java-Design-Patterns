package com.trello.main;

public class ItemCard {
    int id ;
    String name ;
    String description ;
    User assignedUser ;

    public ItemCard(int id, String name, String description, User assignedUser) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.assignedUser = assignedUser;
    }

    public ItemCard(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
}
