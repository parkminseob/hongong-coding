package com.practiceExample.Doit.chap03;

public class seqSearchSen_a {
  static int seqSearchSen(int[]a, int n, int key) {
    int i;
    a[n] = key; // 보초 추가

    for(i = 0; a[i] != key; i++);
    return i == n ? -1 : i;

  }
}
