package com.facebook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FeedManager {
    List<Post> posts = new ArrayList<>();

    List<Post> browseFeed(User user){
       List<Post> usersPost =  posts.stream().filter((e)->e.getUser().getId()==user.getId()).collect(Collectors.toList()) ;
       List<User> friends = user.getFriends() ;
       List<Post> friendPosts =  posts.stream().filter((e)->friends.stream().anyMatch((f)->f.getId()==e.getUser().getId())).collect(Collectors.toList()) ;
       usersPost.addAll(friendPosts);
       usersPost.sort(Comparator.comparing(Post :: getTimeStamp).reversed()) ;
       return usersPost.stream().limit(10).collect(Collectors.toList()) ;
    }

    void addPost(Post post){
        posts.add(post) ;
        System.out.println("Post Added Successfully !") ;
    }

    void deletePost(User user , int postId){
        user.getPosts().remove(posts.stream().filter((e)->e.getId()==postId).findFirst().orElse(null)) ;
        Post post = posts.stream().filter((e)->e.getId() == postId).findFirst().orElse(null) ;
        posts.remove(post) ;
        System.out.println("Post Deleted Successfully !") ;
    }
}
