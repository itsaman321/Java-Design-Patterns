package com.facebook;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaNetwork {
    List<User> users  = new ArrayList<>();

    void addFriend(String user1 , String user2){
        User u1 = users.stream().filter((e)->e.name.equals(user1)).findFirst().orElse(null) ;
        User u2 = users.stream().filter((e)->e.name.equals(user2)).findFirst().orElse(null) ;

        u1.addFriend(u2);
        u2.addFriend(u1);

        System.out.println(u1+ " & " + u2 + " are friends now !") ;
    }

    void removeFriend(String user1 , String user2){
        User u1 = users.stream().filter((e)->e.name.equals(user1)).findFirst().orElse(null) ;
        User u2 = users.stream().filter((e)->e.name.equals(user2)).findFirst().orElse(null) ;

        u1.removeFriend(u2);
        u2.removeFriend(u1);

        System.out.println(u1+ " & " + u2 + " are not friends !") ;
    }


    void createUser(User user){
        users.add(user) ;
        System.out.println(user.getName() +" created Successfully !") ;
    }

}
