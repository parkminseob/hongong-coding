package com.practiceExample;

public class StringReplaceEx {
  public static void main(String[] args) {
    String oldstr = "Java is Object-Oriented Programming";
    String newstr = oldstr.replace("Java", "Python");
    System.out.println(oldstr);
    System.out.println(newstr);
    
    System.out.println(oldstr == newstr);
  }
}
