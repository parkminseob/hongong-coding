package com.baekjoon;

import java.util.Scanner;

public class backjoon2562_a {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[9];
    int max = 0;
    int maxNumber = 0;
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
      
      if(arr[i] > max) {
        max = arr[i];
        maxNumber = i+1;
      }
    }
    System.out.println(max);
    System.out.println(maxNumber);
  }
}
