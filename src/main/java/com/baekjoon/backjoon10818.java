package com.baekjoon;

import java.util.Scanner;

public class backjoon10818 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    int[] x = new int[num]; 
    int max = -1000000;
    int min = 1000000;

    for(int i = 0; i < num; i++) {
      x[i] = scanner.nextInt();

      if(max < x[i]) {
        max = x[i];
      } else if(min > x[i]) {
        min = x[i];
      }
    }
    System.out.printf("%d %d", min, max);

    scanner.close();
  }
}
