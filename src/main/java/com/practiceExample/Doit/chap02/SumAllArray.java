package com.practiceExample.Doit.chap02;

public class SumAllArray {
  static int sumArray(int[] a) {
    int sum = 0;
    for(int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
}
