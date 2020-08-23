package com.baekjoon;

import java.util.Scanner;

public class backjoon8958 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    scanner.nextLine();
    String[] OX = new String[testCase];
    
    for(int i = 0; i < OX.length; i++) {
      OX[i] = scanner.nextLine();
    }
    
    for(int i = 0; i < OX.length; i++) {
      int count = 0;
      int sum = 0;
      
      for(int j = 0; j < OX[i].length(); j++) {
        
        if(OX[i].charAt(j) == 'O') {
          count++;
        } else {
          count = 0; 
        }
        sum += count;
      }
      System.out.println(sum);
    }
    
    scanner.close();
  }
}
