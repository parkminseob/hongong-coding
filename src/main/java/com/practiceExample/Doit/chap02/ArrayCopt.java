package com.practiceExample.Doit.chap02;

import java.util.Scanner;

public class ArrayCopt {
  static void copy(int[] a, int[] b) {
    int num;
    if(a.length <= b.length) {
      num = a.length;
    } else {
      num = b.length;
    }
    for(int i = 0; i < b.length; i++) {
      a[i] = b[i];
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numa = scanner.nextInt();
    int[] a = new int[numa];
    for(int i = 0; i < numa; i++) {
      System.out.println(i);
      a[i] = scanner.nextInt();
    }

    int numb = scanner.nextInt();
    int[] b = new int[numb];
    for(int i = 0; i < numb; i++) {
      System.out.println(i);
      b[i] = scanner.nextInt();
    }

    copy(a, b);

    System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
    for (int i = 0; i < numa; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}
