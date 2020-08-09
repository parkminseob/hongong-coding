package com.bakjoon;

import java.util.Scanner;

public class backjoon11021 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

      for (int i = 1; i <= T; i++) {    
        int sum = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(0 < A && B < 10) {
        sum = A + B;
        System.out.printf("Case #%d: %d + %d = %d\n", i, A, B, sum);
        }
      }
  sc.close();
  }
}
