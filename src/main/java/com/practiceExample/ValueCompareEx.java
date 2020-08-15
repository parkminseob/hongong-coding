package com.practiceExample;

public class ValueCompareEx {
  public static void main(String[] args) {
    System.out.println("[-127~128 Oeverflow value]");
    Integer obj1 = 300;
    Integer obj2 = 300;
    System.out.println("==result: " + (obj1 == obj2)); //f
    System.out.println("Unboxing ==result: " + (obj1.intValue()==obj2.intValue())); //t
    System.out.println("equals() result: " + obj1.equals(obj2)); //t
    System.out.println();
    
    System.out.println("[-128~127 value]");
    Integer obj3 = 10;
    Integer obj4 = 10;
    System.out.println("==result: " + (obj3 == obj4)); //t
    System.out.println("Unboxing ==result: " + (obj3.intValue()==obj4.intValue())); //t
    System.out.println("equals() result: " + obj3.equals(obj4)); //t
  }
}
