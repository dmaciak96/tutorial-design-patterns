package com.example.designpatterns.creational.factorymethod.creator;

import com.example.designpatterns.creational.factorysimple.NewsPost;
import com.example.designpatterns.creational.factorysimple.Post;

public class NewsPostCreator implements PostCreator{

  @Override
  public Post createPost(String... params) {
    if(params.length != 2) {
      throw new RuntimeException("News post require 2 arguments");
    }
    return new NewsPost(params[0], params[1]);
  }
}
