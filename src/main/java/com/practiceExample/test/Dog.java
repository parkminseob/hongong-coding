package com.practiceExample.test;

public class Dog extends Animal {

  @Override
  public void Sound() {
    System.out.println("멍멍..");
  }

  public Dog() {
    this.kind = "포유류";
  }
}
