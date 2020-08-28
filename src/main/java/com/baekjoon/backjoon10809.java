package com.baekjoon;

import java.util.Scanner;

public class backjoon10809 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    
    int[] arr = new int[26];
    int count = 0;
    
    for(int i = 0; i < 26; i++) {
      arr[i] = -1;
    } // 배열 -1로 초기화
    
    for(int i = 0; i < word.length(); i++) { //입력받은 문자의 길이만큼 i++
      char c = word.charAt(i); // 그 문자열을 한개씩 잘라서 char값에 넣는다 
      count = c; // int변수에 잘려진 c문자 넣기 
      
      // 97은 a의 아스키코드값 
      if(arr[c-97] == -1) { //단어가 포함이 되어있다면 
        arr[c-97] = i; //알파벳 배열에 입력받은 문자가 등장하는 위치를 넣는다.
      }
    }
    
    for(int i = 0; i < 26; i++) { // for문으로 배열을 출력한다.
      System.out.print(arr[i] + " "); // 공백과 함께 배열 출력.
    }
    
  }
}
