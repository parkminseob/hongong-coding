package com.practiceExample.Doit;

import java.util.Scanner;

public class SumForPos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;

    System.out.println("1~n까지의 합");

    // n이 0보다 클 때까지 반복한다.
    do {
      System.out.print("n의 값 : ");
      n = s.nextInt();
    } while(n <= 0);

    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("합계 : " + sum);
  }

}
