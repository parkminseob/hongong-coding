package com.practiceExample;

public class StringEqualsEx {
  public static void main(String[] args) {
    String str1 = new String("PMS");
    String str2 = "PMS";
    
    if(str1 == str2) {
      System.out.println("Same String instance");
    } else {
      System.out.println("different String instance");
    }
    
    if(str1.equals(str2)) {
      System.out.println("Same String");
    } else {
      System.out.println("different String");
    }
  }
}
