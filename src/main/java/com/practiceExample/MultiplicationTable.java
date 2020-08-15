package com.practiceExample;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args ) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    if (n >= 10) {
    } else if (n <= 1) {
    } else {
      int sum = 0;
      for (int i = 1; i <= 9; i++) {
        sum = i * n;
        System.out.printf("%d * %d = %d\n", n, i, sum);
      }
      
    }
  scanner.close();
  }
}