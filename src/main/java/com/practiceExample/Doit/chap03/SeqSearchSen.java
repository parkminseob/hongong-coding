package com.practiceExample.Doit.chap03;

import java.util.Scanner;

// 선형 검색(보초법)
public class SeqSearchSen {
  // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색한다.
  static int seqSearchSen(int[] a, int n, int key) {
    int i = 0;

    a[n] = key; // 보초 추가

    while(true) {
      if(a[i] == key) { //검색 성공!
        break;
      }
      i++;
    }
    return i == n ? -1 : i;
    // while문에 의한 반복이 완료되면 찾은 값이 배열의 원래 데이터인지 아니면 보초인지
    // 판단해야 한다. 변수 i값이 n이면 찾은 값이 보초이므로 검색 실패임을 나타내는
    // -1을 리턴한다.
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요솟수 : ");
    int num = scanner.nextInt();
    int[] x = new int[num + 1]; //요솟수 num + 1

    for(int i = 0; i < num; i++) {
      System.out.print("x[" + i + "] : ");
      x[i] = scanner.nextInt();
    }

    System.out.println("검색할 값 : "); // 키 값을 입력
    int ky = scanner.nextInt();

    int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

    if(idx == -1) {
      System.out.println("그 값의 요소가 없습니다.");
    } else {
      System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }

    scanner.close();
  }
}
