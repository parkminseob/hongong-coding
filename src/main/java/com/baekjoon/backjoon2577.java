package com.baekjoon;

import java.util.Scanner;

public class backjoon2577 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int sum = a * b * c;
    
    int[] arr = new int[10];

    while(sum != 0) {
      arr[sum%10]++; //배열 안에 0~9에 해당하는 개수가 들어간다. 배열 카운트를 더하기
      sum/=10;
    }
    for(int result : arr) {
      System.out.println(result);
    }
    
    sc.close();
  }
}
