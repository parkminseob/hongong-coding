package com.practiceExample.Doit.chap02;

public class PrimNumber2 {
  public static void main(String[] args) {
    int counter = 0; // 나눗셈 횟수
    int ptr = 0; // 찾은 소수의 갯수
    int[] prime = new int[500]; // 소수를 저장하는 배열

    prime[ptr++] = 2; // 2는 소수다.

    for(int i = 3; i <= 1000; i+=2) { // 대상은 홀수만
      int j;
      for(j = 1; j < ptr; j++) { // 이미 찾은 소수로 나누기
        counter++;
        if(i % prime[j] == 0) { // 나머지가 0이면 짝수
          break;
        }
      }
      if(ptr == j) { // 마지막까지 나누어 떨어지지 않는것
        prime[ptr++] = i; // 배열에 저장한다,
      }
    }

    for(int i = 0; i < ptr; i++) {
      System.out.println(prime[i]);
    }
    System.out.println(counter);
  }
}
