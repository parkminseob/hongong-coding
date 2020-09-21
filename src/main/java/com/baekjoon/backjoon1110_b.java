package com.baekjoon;

import java.util.Scanner;

public class backjoon1110_b {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int count = 0;
    int sum = a;
    
    while(true) {
      count++;
      int x = (sum/10);
      int y = (sum%10);
      
      if(x+y<10) {
        sum = y*10 + (x+y);
      } else {
        sum = y*10 + ((x+y)%10);
      }
      if(sum == a) {
        break;
      }
    }
    System.out.println(count);
  }
}
