package com.facebook;

public class main {
    public static void main(String[] args){
        SocialMediaNetwork socialMediaNetwork = new SocialMediaNetwork();

        //CreateUser
        User user1 = new User("user1") ;
        User user2 = new User("user2") ;

        socialMediaNetwork.createUser(user1);
        socialMediaNetwork.createUser(user2);

        //Create Post
        Post post1 = new Post(user1 , "My First Feed !");
        Post post2 = new Post(user1 , "Hello World !");

        FeedManager feedManager = new FeedManager();
        feedManager.addPost(post1);
        feedManager.addPost(post2);

        socialMediaNetwork.addFriend("user1" , "user2");

        feedManager.browseFeed(user1).stream().forEach((e)->System.out.println(e.getContent()));

        socialMediaNetwork.removeFriend("user1", "user2");

        feedManager.deletePost(user1 , post1.getId());

    }
}
