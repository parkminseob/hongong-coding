package com.baekjoon;

import java.util.Scanner;

public class backjoon1267 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int callNumber = scanner.nextInt();
    int Young = 0, Min = 0;
    int callTime[] = new int[callNumber];

    for(int i = 0; i < callNumber; i++) {
      callTime[i] = scanner.nextInt();

      Young += ((callTime[i] / 30)+1) * 10;
      Min += ((callTime[i] / 60)+1) * 15;
    }

    if(Young == Min) {
      System.out.println("Y M "+ Min);
    } else if(Young < Min) {
      System.out.println("Y " + Young);
    } else {
      System.out.println("M " + Min);
    }

    scanner.close();
  }
}
