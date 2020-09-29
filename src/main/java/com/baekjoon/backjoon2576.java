package com.baekjoon;

import java.util.Scanner;

public class backjoon2576 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 7;
    int[] odd = new int[x];
    int sum = 0;
    int min = 100;
    boolean b = false;

    for(int i = 0; i < x; i++) {
      odd[i] = scanner.nextInt();
      if(odd[i] % 2 == 1) {
        b = true;
        sum += odd[i];
        if(odd[i] < min) {
          min = odd[i];
        }
      }
    }
    if(!b) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(min);
    }
    scanner.close();
  }
}
