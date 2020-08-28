package com.baekjoon;

import java.util.Scanner;

public class backjoon2908_a {
  static int reverse(int num) {
    
    String out = "";
    
    while(num != 0) {
      out += (num%10);
      num = num/10;
    }
    return Integer.parseInt(out);
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    
    A = reverse(A);
    B = reverse(B);
    System.out.println(A>B ? A : B);
  }
}
