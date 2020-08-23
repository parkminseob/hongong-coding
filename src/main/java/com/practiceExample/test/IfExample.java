package com.practiceExample.test;

public class IfExample {
  public static void main(String[] args) {
    int score = 99;

    if(score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
    }

    if(score < 90)
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다.");

      //if문은 중괄호로 묶지 않으면 바로 아랫문장까지만 한문장으로 취급됨.

  }

}
