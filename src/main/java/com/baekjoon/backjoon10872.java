package com.baekjoon;

import java.util.Scanner;

public class backjoon10872 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 1;
    int factorial = scanner.nextInt();
    for(int i = 2; i<= factorial; i++) {
      sum *= i;
    }
    System.out.println(sum);
  }
}
