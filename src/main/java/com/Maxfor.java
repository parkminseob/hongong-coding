package com;

public class Maxfor {
  public static void main(String[] args) {
    int max = 0;
    int[] array = {1, 15, 3, 8, 2};

    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    // max에 값이 들어갔을때 끝나지 않고 for 문 배열 길이만큼 반복되다가
    // 결국 최종값은 15가 된다.

    System.out.println("max" + max);



  }
}
