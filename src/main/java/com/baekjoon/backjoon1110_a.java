package com.baekjoon;

import java.util.Scanner;

public class backjoon1110_a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    
    int count = 0;
    int temp = num;
    
    while (true) {
      int a = temp/10;
      int b = temp%10;
      
      if (a+b <10) {
        temp = b*10 + (a+b);
      } else {
        temp = b*10 +(a+b)%10;
      }
      count++;
      if(temp==num) {
        break;
      }
    }
    System.out.println(count);
  }
}
