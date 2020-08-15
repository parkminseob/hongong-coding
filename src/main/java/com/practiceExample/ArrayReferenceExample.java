package com.practiceExample;

public class ArrayReferenceExample {
public static void main(String[] args) {
  String[] str = new String[3];

  str[0] = "JAVA";
  str[1] = "JAVA";
  str[2] = new String("JAVA");

  System.out.println(str[0] == str[1]);
  System.out.println(str[0] == str[2]);
  System.out.println(str[0].equals(str[2]));
}
}
