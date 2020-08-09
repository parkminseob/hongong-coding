package com.bakjoon;

import java.util.Scanner;

public class backjoon10871 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    
    int[] a = new int[N];
    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
    
    for(int i = 0; i < a.length; i++) {
      if(a[i] < X) {
        System.out.print(a[i] + " ");
      }
    }
  }
}
