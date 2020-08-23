package com.baekjoon;

import java.util.Scanner;

public class backjoon3052 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int[] arr = new int[42];
    
    for(int i = 0; i < 10; i++) {
      arr[scanner.nextInt()%42]++;
    }
    
    for(int num : arr) {
      if(num != 0) {
        count++;
      }
    }
    System.out.println(count);
    scanner.close();
  }
}
