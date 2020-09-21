package com.practiceExample.test;

public class Cat extends Animal {

  @Override
  public void Sound() {
    System.out.println("야옹!");
  }

  public Cat() {
    this.kind = "포유류";
  }
}
