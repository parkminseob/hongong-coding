package com.practiceExample.Doit.chap02;

import java.util.Scanner;

public class ReverseArray01 {

  static void swap(int[] a, int x, int y) {
    int t = a[x];
    a[x] = a[y];
    a[y] = t;
  }

  static void reverse(int[] a) {
    for(int i = 0 ; i < a.length/2; i++) {
      System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
      swap(a, i, a.length - i - 1);
      print(a);
    }
  }

  static void print(int[] a) {
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요솟수는 ：");
    int num = scanner.nextInt();

    int[] x = new int[num];

    for(int i = 0; i < num; i++) {
      System.out.print("x[" + i + "] : ");
      x[i] = scanner.nextInt();
    }
    reverse(x);
  }
}
