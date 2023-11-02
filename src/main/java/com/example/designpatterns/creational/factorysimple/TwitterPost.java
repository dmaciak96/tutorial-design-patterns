package com.example.designpatterns.creational.factorysimple;

public class TwitterPost extends Post {

  public TwitterPost(String message) {
    super(message);
  }

  @Override
  public String toString() {
    return "Twitter Post: " + getMessage();
  }
}
