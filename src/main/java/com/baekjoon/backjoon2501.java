package com.baekjoon;

import java.util.Scanner;

public class backjoon2501 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();

    for(int i = 1; i <= N; i++) {
      if(N % i == 0) {
        K--;
      }
      if(K == 0) {
        System.out.println(i);
        break;
      }
    }
    if (K != 0) {
      System.out.println(0);
    }
    scanner.close();
  }
}
