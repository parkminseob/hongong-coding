package com;

import java.util.Scanner;

public class FactorialCalc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 팩토리얼 공식
    int result = 1;

    System.out.println("[팩토리얼 계산기]");
    int num = scanner.nextInt();

    for (int i = 2; i <= num; i++) {
      result *= i;
    }

    System.out.println(result);
    scanner.close();
  }
}
