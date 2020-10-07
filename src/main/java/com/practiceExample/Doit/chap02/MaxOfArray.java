package com.practiceExample.Doit.chap02;

import java.util.Scanner;

public class MaxOfArray {

  static int maxOf(int[] a) {
    int max = a[0];
    for(int i = 1; i <= a.length; i++) {
      if(a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("키의 최대값");
    System.out.println("사람수 : ");
    int x = scanner.nextInt();

    int[] height = new int [x];

    for(int i = 0; i < x; i++) {
      System.out.print("height[" + i + "] : ");
      height[i] = scanner.nextInt();
    }
    System.out.println("최대값 : " + maxOf(height));
  }
}
