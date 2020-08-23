package com.baekjoon;

import java.util.Scanner;

public class backjoon3052_a {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int[] arr = new int[42];
    int[] tenArray = new int[10];

    for (int i = 0; i < tenArray.length; i++) {
      tenArray[i] = scanner.nextInt()%42;
    } //42로 나눈 나머지 

    for(int i = 0; i < tenArray.length; i++) {//0~41까지 배열에 tenArray를 넣고 arr값을 +1시킨다.
      for(int j = 0; j < arr.length; j++) {
        if(tenArray[i] == j) {
          arr[j]++;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != 0){
        count++;
      }
    }
    System.out.println(count);
  } 
}
