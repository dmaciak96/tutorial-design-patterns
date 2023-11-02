package com.example.designpatterns.creational.factorysimple;

public class FactorySimpleDemo {
  public static void main(String[] args){
    var news = SimpleFactory.createPost("news");
    var twitter = SimpleFactory.createPost("twitter");
    System.out.println(news);
    System.out.println(twitter);
  }
}
