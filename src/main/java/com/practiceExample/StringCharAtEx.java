package com.practiceExample;

public class StringCharAtEx {
  public static void main(String[] args) {
    String ssn = "010876-1234567";
        char sex = ssn.charAt(7);
    
    switch (sex) {
      case '1' :
      case '3' :
        System.out.println("male");
        break;
      case '2' :
      case '4' :
        System.out.println("female");
        break;
    }
  }
}
