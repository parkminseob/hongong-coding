package com.practiceExample.Doit;

import java.util.Scanner;

public class Digits {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int no;

    System.out.println("2자리 정수 입력");

    do {
      System.out.println("입력 : ");
      no = s.nextInt();

    } while (no < 10 || no > 99);

    System.out.println(no);
  }
}
