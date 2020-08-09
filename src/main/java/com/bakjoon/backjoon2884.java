package com.bakjoon;

import java.util.Scanner;

public class backjoon2884 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    sc.close();
    
    if (m >= 45) {
      m -= 45;
      System.out.printf("%d %d", h, m);
    } else if (m < 45) {
      if (h > 0) {
        h -= 1;
        m += 15;
        System.out.printf("%d %d", h, m);
      } else if (h == 0) {
        h = 23;
        m += 15;
        System.out.printf("%d %d", h, m);
      }
    }
  }
}
