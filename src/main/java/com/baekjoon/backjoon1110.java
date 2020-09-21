package com.baekjoon;

import java.util.Scanner;

public class backjoon1110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    int count = 0;
    int temp = n; 
    
    while(true) {
      int a = temp/10; 
      int b = temp%10;
      
      if (a+b < 10) {
        temp = b*10 + (a+b); 
      } else { 
        temp = b*10 + (a+b)%10;
      }
      count++;
      if (temp == n) {
        break;
      }
    }
    System.out.println(count);
    
  }
}
