package com.example.designpatterns.creational.factorysimple;

public abstract class Post {

  private String message;

  protected Post(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
