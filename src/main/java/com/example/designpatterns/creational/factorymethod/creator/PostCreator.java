package com.example.designpatterns.creational.factorymethod.creator;

import com.example.designpatterns.creational.factorysimple.Post;

public interface PostCreator {
  Post createPost(String... params);
}
