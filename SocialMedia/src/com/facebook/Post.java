package com.facebook;

import java.time.LocalDateTime;
import java.util.random.RandomGenerator;

public class Post {

    int id  ;

    User user  ;

    String content ;

    LocalDateTime timeStamp ;

    public Post(User user, String content) {
        this.user = user;
        this.content = content;
        this.id = RandomGenerator.getDefault().nextInt(100) ;
        this.timeStamp = LocalDateTime.now();
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
