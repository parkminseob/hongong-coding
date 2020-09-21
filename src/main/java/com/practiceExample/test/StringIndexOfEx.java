package com.practiceExample.test;

public class StringIndexOfEx {
  public static void main(String[] args) {
    String str = "Java Programming";
    
    int i = str.indexOf("Programming");
    System.out.println(i);
    
    if(str.indexOf("Java")!= -1) {
      System.out.println("This is Java");
    } else {
      System.out.println("This is not Java");
    }
  }
}
