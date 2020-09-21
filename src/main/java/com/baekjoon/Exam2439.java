package com.baekjoon;

import java.util.Scanner;

public class Exam2439 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int star = scanner.nextInt();
    scanner.close();
    
    for(int i = 1; i <= star; i++) {
      for(int j = star; j > 0; j--) {
        if(j > i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
    
  }
}
