package com.baekjoon;

import java.util.Scanner;

public class backjoon10870 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
    
    System.out.println(fibo(num));
  }
  
  static int fibo(int num) {
    if (num == 0) {
      return 0;
    } else if(num == 1 || num == 2) {
      return 1;
    }
    return fibo(num - 1) + fibo(num - 2);
  }
}
