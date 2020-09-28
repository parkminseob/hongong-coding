package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class backjoon15552 {
  public static void main(String[] args) throws Exception {
    BufferedReader bufR = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufW = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str;

    int x = Integer.parseInt(bufR.readLine());

    for(int i = 0; i < x; i++) {
      str = new StringTokenizer(bufR.readLine());
      int a = Integer.parseInt(str.nextToken());
      int b = Integer.parseInt(str.nextToken());
      int sum = a+b;

      bufW.write(sum + "\n");
    }
    bufW.flush();
  }
}
