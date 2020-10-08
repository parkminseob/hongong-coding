package com.practiceExample.Doit.chap02;

import java.util.Scanner;

public class CardConvRev {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int no; // 변환하는 정수
    int cd; // 기수
    int dno; //변환후의 자릿수
    int retry; // 다시한번?
    char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자 배열

    System.out.println("10진수 기수 변환");
    do {
      do {
        System.out.println("변환하는 음이 아닌 정수 : ");
        no = scanner.nextInt();
      } while(no < 0);

      do {
        System.out.println("어떤 진수로 변환할건가요? (2~36) : ");
        cd = scanner.nextInt();
      } while(cd<2 || cd > 36);

      dno = CardConcRev.cardConvR(no, cd, cno);

      System.out.print(cd + "진수로는 ");
      for(int i = dno-1; i >= 0; i--) {
        System.out.println(cno[i]);
      }
      System.out.println("입니다.");

      System.out.println("한번더? (1:예 / 2:아니요");
      retry = scanner.nextInt();
    } while(retry == 1);
  }
}
