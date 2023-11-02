package com.example.designpatterns.creational.builder;

public class BuilderDemo {
  public static void main(String[] args){
    var user = new User.Builder()
        .email("test@test.com")
        .bmi(25.1)
        .firstName("Test")
        .lastName("User")
        .password("testpasswd")
        .age(25)
        .build();

    System.out.println(user);
  }
}
