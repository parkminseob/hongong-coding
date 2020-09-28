package com.baekjoon;

import java.util.Scanner;

public class backjoon2420 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    long M = scanner.nextLong();

    long result = Math.abs(N-M);
    System.out.println(result);

    scanner.close();
  }
}
