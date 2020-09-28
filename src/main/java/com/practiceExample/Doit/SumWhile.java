package com.practiceExample.Doit;

import java.util.Scanner;

public class SumWhile {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("1 ~ n 까지의 합");
    System.out.print("n의 값 : ");
    int n = s.nextInt();

    int sum = 0;
    int i = 1;

    while(i <= n) { // i가 n 이하면 반복
      sum += i; // sum에 i를 더한다.
      i++; // i 값을 1만큼 증가시칸다.
    }
    System.out.println("합계 : " + sum);
  }
}
