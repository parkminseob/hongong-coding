package com.baekjoon;

import java.util.Scanner;

public class backjoon10818a {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int Min = 1000000;
    int Max = -1000000;
    
    int[] arr = new int[num];
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
      
      if(arr[i] > Max) {
        Max = arr[i];
      } else if(arr[i] < Min) {
        Min = arr[i];
      }
    }
    System.out.println(Max + " " + Min);
    scanner.close();
  }
}
