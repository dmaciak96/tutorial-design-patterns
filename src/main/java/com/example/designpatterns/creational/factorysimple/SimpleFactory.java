package com.example.designpatterns.creational.factorysimple;

public class SimpleFactory {
  public static Post createPost(String type) {
    if (type.equalsIgnoreCase("news")) {
      return new NewsPost("message", "title");
    } else if (type.equalsIgnoreCase("twitter")) {
      return new TwitterPost("message");
    } else {
      throw new RuntimeException("Post type not recognized");
    }
  }
}
