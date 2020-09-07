package com.baekjoon;

import java.util.Scanner;

public class backjoon2441 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int star = scanner.nextInt();

    for(int i = 0; i < star; i++) {
      // 공백 찍기
      for(int j = 0; j < i ; j++) {
        System.out.print(" ");
      }
      // 별 찍기
      for(int k = star; k > i; k--) {
        System.out.print("*");
      }
      System.out.println("");
    }
    scanner.close();
  }

}
