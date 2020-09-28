package com.baekjoon;

import java.util.Scanner;

public class backjoon2163 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int count = (N * M) - 1;

    System.out.println(count);
    scanner.close();
  }
}
