package com.example.designpatterns.creational.factorymethod.creator;

import com.example.designpatterns.creational.factorysimple.Post;
import com.example.designpatterns.creational.factorysimple.TwitterPost;

public class TwitterPostCreator implements PostCreator {

  @Override
  public Post createPost(String... params) {
    if (params.length != 1) {
      throw new RuntimeException("Twitter post require 1 arguments");
    }
    return new TwitterPost(params[0]);
  }
}
