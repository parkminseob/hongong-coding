package com.practiceExample.Doit;

public class Max3m {
  static int max3(int a, int b, int c, int d) {
    int max = a;
    if(b > max)
      max = b;
    if(c > max)
      max = c;
    if(d > max)
      max = d;

    return max;
  }

  public static void main(String[] args) {
    System.out.println(max3(3, 4, 5, 6));
  }
}
