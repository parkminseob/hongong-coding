package com.practiceExample.Doit.chap02;

import java.util.Scanner;

public class ReverseArray3 {
  static void swap(int[] arr, int a, int b) {
    int t = arr[a];
    arr[a] = arr[b];
    arr[b] = t;
  }

  static void reverse(int[] arr) {
    for(int i = 0; i < arr.length/2; i++) {
      swap(arr, i, arr.length - i -1);
    }
    print(arr);
  }

  static void print(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요솟수는 ：");
    int num = scanner.nextInt();

    int[] arr = new int[num];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    reverse(arr);
  }
}
