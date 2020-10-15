package com.practiceExample.Doit.chap03;

import java.util.Scanner;

public class SeqSearch {
  //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
  static int seqSearch(int[] a, int n, int key) {
    int i = 0;

    for(i = 0; i < n; i++) {
      if(a[i] == key) {
        return i;
      }
    }
    return -1;
    //    while(true) {
    //      if(i == 0)
    //        return -1;
    //      if(a[i] == key)
    //        return i;
    //    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요솟수 : ");
    int num = scanner.nextInt();
    int[] x = new int[num]; // 요솟수가 num인 배열

    for(int i = 0; i < num; i++) {
      System.out.println("x[" + i + "] : ");
      x[i] = scanner.nextInt();
    }

    System.out.print("검색할 값 : "); // 키 값을 검색
    int ky = scanner.nextInt();
    int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색

    if(idx == -1) {
      System.out.println("그 값의 요소가 없습니다.");
    } else {
      System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }

  }
}
