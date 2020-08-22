package com.baekjoon;

import java.util.Scanner;

public class baekjoon4344 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    double aver = 0;
    int[] scores = new int[1000];

    for(int i = 0; i < testCase; i++) { //case의 숫자 입력받기
      System.out.print("학생 수 입력");
      int num = scanner.nextInt();
      int count = 0; // 평균 넘는 학생 수 돌때마다 초기화 
      int sum = 0; // 총합 한번 돌 때 마다 초기화 

      for(int j = 0; j < num; j++) { // 배열갯수의 num을 받고 점수 입력받기
        System.out.print("점수입력");
        scores[j] = scanner.nextInt();
        sum += scores[j]; //총합 
      }
      aver = (double)sum/num; //평균
      for(int j = 0; j < num; j++) { //평균을 넘는 학생 수 
        if(scores[j] > aver) {
          count++;
        } 
      }
      System.out.printf("%.3f", 100.0 * count / num);
      System.out.println("%");
    }
    scanner.close();
  }
}
