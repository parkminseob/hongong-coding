package com.practiceExample.Doit.chap03;

public class Exam0113 {
  static int seqSearch(int[] a, int n, int key) {
    int i = 0;
    while (i < n) {
      if(a[i] == key) {
        return i;
      }
      i++;
    }
    return -1;
  }

  public static void main(String[] args) {

  }
}
