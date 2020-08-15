package com.practiceExample;

public class MaxForAndMIn {
  public static void main(String[] args) {
    int[] array = {78, 15, 6, 8, 2, 56};
    int max = array[0];
    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
      if (min > array[i]) {
        min = array[i];
      }
    }
    // max에 값이 들어갔을때 끝나지 않고 for 문 배열 길이만큼 반복되다가
    // 결국 최종값은 15가 된다.

    System.out.println("max" + max);
    System.out.println("min" + min);



  }
}
