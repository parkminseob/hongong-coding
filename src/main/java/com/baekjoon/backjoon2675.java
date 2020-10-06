package com.baekjoon;

import java.util.Scanner;

public class backjoon2675 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

    for(int i = 0; i < x; i++) {
      int num = scanner.nextInt();
      String str = scanner.next();

      for(int j = 0; j < str.length(); j++) {
        for(int k = 0; k < num; k++) {
          System.out.print(str.charAt(j));
        }
      }
      System.out.println();
    }
    scanner.close();

  }
  //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //
  //    int num = Integer.parseInt(br.readLine());
  //
  //    for(int i = 0; i < num; i++) {
  //      String[] str = br.readLine().split(" ");
  //
  //      int n = Integer.parseInt(str[0]);
  //      String s = str[1];
  //
  //      for(int j = 0; j < s.length(); j++) {
  //        for(int k = 0; k < n; k++) {
  //          System.out.print(s.charAt(j));
  //        }
  //      }
  //      System.out.println();
  //    }
  //  }
}
