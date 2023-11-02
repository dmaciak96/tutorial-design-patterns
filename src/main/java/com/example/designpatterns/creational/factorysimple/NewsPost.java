package com.example.designpatterns.creational.factorysimple;

public class NewsPost extends Post {
  private String title;

  public NewsPost(String message, String title) {
    super(message);
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "NewsPost{" + "title='" + title + '\'' + "message='" + getMessage() + '\'' + '}';
  }
}
