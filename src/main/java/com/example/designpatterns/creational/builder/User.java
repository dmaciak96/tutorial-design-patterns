package com.example.designpatterns.creational.builder;

public class User {
  private String firstName;
  private String lastName;
  private String email;
  private int age;
  private String password;
  private double bmi;

  public User(
      String firstName, String lastName, String email, int age, String password, double bmi) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
    this.password = password;
    this.bmi = bmi;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public int getAge() {
    return age;
  }

  public String getPassword() {
    return password;
  }

  public double getBmi() {
    return bmi;
  }

  @Override
  public String toString() {
    return "User{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", age=" + age +
        ", password='" + password + '\'' +
        ", bmi=" + bmi +
        '}';
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String password;
    private double bmi;

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder bmi(double bmi) {
      this.bmi = bmi;
      return this;
    }

    public User build() {
      return new User(this.firstName, this.lastName, this.email, this.age, this.password, this.bmi);
    }
  }
}
