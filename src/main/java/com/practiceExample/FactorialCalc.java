package com.practiceExample;

import java.util.Scanner;

public class FactorialCalc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int result = 1;
    int num = scanner.nextInt();

    for (int i = 2; i <= num; i++) {
      result *= i;
    }

    System.out.println(result);
    scanner.close();
  }
}
