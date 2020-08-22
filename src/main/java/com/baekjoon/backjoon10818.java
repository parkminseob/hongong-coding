package com.baekjoon;

import java.util.Scanner;

public class backjoon10818 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] x = new int[n];
    int Min =  1000000;
    int Max = -1000000;
    
    for(int i = 0; i < x.length; i++) {
      x[i] = sc.nextInt();
      
      if(x[i] > Max) {
        Max = x[i];
      } 
      if (x[i] < Min) {
        Min = x[i];
      }
    }
    System.out.println(Min + " " + Max);
  }
}
