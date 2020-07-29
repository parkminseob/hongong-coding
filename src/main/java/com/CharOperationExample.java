package com;

public class CharOperationExample {
    public static void main(String[] args) {
      
      char c1 = 'A' + 1; //66
      char c2 = 'A'; //65
      
      //char c3 = c2 + 1;  // char타입은 산술연산에서 int로 변환됨.
      System.out.println("c1: " + c1); //B
      System.out.println("c2: " + c2); //A
      //System.out.println("c3: " + c3);
      
    }
}
