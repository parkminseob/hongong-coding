package com.practiceExample.test;

public class Test {
  public static void main(String[] args) {
    // % 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");

    // & 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");
    //   00111001 (57)
    // & 00000001
    // ------------
    //   00000001 (1)

  }
}
