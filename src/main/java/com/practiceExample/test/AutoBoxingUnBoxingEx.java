package com.practiceExample.test;

public class AutoBoxingUnBoxingEx {
  public static void main(String[] args) {
    
    // AutoBoxing
    Integer obj = 100;
    System.out.println("value: "+ obj.intValue());
    
    // AutoUnBoxing
    int value = obj;
    System.out.println("value: " + value);
    
    // Operating AutoUnBoxing
    int result = obj + 100;
    System.out.println("result: "+ result);
  }
}
