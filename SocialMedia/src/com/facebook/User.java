package com.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class User {

    int id  ;
    String name ;
    List<User> friends ;
    List<Post> posts ;

    public User(String name){
        this.id = RandomGenerator.getDefault().nextInt(50);
        this.name = name ;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    void addFriend(User user){
        friends.add(user) ;
    }

    void removeFriend(User user){
        friends.remove(user);
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
}
