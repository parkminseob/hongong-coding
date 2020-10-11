package com.practiceExample.Doit.chap02;

import java.util.Scanner;

public class DayOfYear {
  // 각 달의 일 수
  static int[][] mdays = {
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년
  };

  // 서기 year년은 윤년인가? (윤년 : 1 / 평년 / 0)
  static int isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
  }

  // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
  static int dayOfYear(int y, int m, int d) {
    int days = d; // 일수

    for(int i = 1; i < m; i++) { // 1월~(m-1)월의 일 수를 더함
      days += mdays[isLeap(y)][i - 1];
    }

    while(--m != 0) {
      d += mdays[isLeap(y)][m-1];
    }

    // return d;
    return days;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int retry;

    System.out.println("그 해 경과 일수를 구합니다.");

    do {
      System.out.println("년 : "); int year = scanner.nextInt();
      System.out.println("월 : "); int month = scanner.nextInt();
      System.out.println("일 : "); int day = scanner.nextInt();

      System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

      System.out.println("한번 더 합니까? (1. 예/ 0.아니오) : ");
      retry = scanner.nextInt();
    } while(retry == 1);
  }
}
