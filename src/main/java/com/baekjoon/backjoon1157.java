package com.baekjoon;
// 1) 가장 많이 쓰인 알파벳이 무엇인지 알아내자
// 2) 대문자 소문자 구분하지 않는다.
// 3) 이 단어에서 가장 많이 쓰인 알파벳을 대문자로 출력
// 4) 단 많이 사용된 알파벳이 여러개일 경우 ? 출력

// 풀이법
// 1) 문자열을 입력받는다
// 2) 문자열을 한개씩 잘라 배열에 넣는다
// 3) 문자열에 동일한 알파벳들을 대소문자 구분없이 카운팅한다.


import java.util.Scanner;

public class backjoon1157 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine().toUpperCase();
    int result = 0;
    
    int[] arr = new int[26];
    
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      arr[i] = c;
      
    }
    
    
  }
}
