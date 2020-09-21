package com.practiceExample.Interface;

public class MyClassExample {
  public static void main(String[] args) {
    System.out.println("1---");

    MyClass m1 = new MyClass();
    m1.rc.turnOn();
    m1.rc.setVolume(2);

    System.out.println("2---");

    MyClass m2 = new MyClass(new Audio());

    System.out.println("3---");

    MyClass m3 = new MyClass();
    m3.methodA();

    System.out.println("4---");

    MyClass m4 = new MyClass();
    m4.methodB(new Television());
  }
}
