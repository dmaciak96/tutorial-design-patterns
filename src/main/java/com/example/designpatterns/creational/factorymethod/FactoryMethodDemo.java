package com.example.designpatterns.creational.factorymethod;

import com.example.designpatterns.creational.factorymethod.creator.NewsPostCreator;
import com.example.designpatterns.creational.factorymethod.creator.TwitterPostCreator;

public class FactoryMethodDemo {
  public static void main(String[] args) {
    var newsPost = new NewsPostCreator().createPost("title", "message");
    var twitterPost = new TwitterPostCreator().createPost("message");
    System.out.println(newsPost);
    System.out.println(twitterPost);
  }
}
