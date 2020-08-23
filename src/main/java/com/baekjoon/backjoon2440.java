package com.baekjoon;

import java.util.Scanner;

public class backjoon2440 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int star = scanner.nextInt();
    
    for(int i = 0; i < star; i++) {
      for(int j = i; j < star; j++) {
        
          System.out.print("*");
      }
      System.out.println();
    }
  }
}
