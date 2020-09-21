package com.practiceExample.test;

public class BoxingUnBoxingEx {
  public static void main(String[] args) {
    
    // Boxing
    Integer i1 = new Integer(100);
    Integer i2 = new Integer("200");
    Integer i3 = Integer.valueOf("300");
    
    // Unboxing
    int v1 = i1.intValue();
    int v2 = i2.intValue();
    int v3 = i3.intValue();
    
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
  }
}
