package com.baekjoon;

import java.util.Scanner;

public class backjoon2908 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String A = scanner.nextLine(); //734
    String B = scanner.nextLine();
    
    String x = A.substring(0, 1); //7
    String y = A.substring(1, 2); //3
    String z = A.substring(2); //4
    
    int n1 = Integer.parseInt((z)+(y)+(x));
    
    
    String a = B.substring(0, 1);
    String b = B.substring(1, 2);
    String c = B.substring(2);
    
    int n2 = Integer.parseInt((c)+(b)+(a));
    
    if(n1>n2) {
      System.out.println(n1);
    } else {
      System.out.println(n2);
    }
  }
  
//  
//  static int reverse(String num) {
//    
//    String out = "";
//    int x = Integer.parseInt(num);
//    
//    while(x != 0) {
//      out += (x%10);
//      x = x/10;
//    }
//    return x;
//  }
//  
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String A = scanner.nextLine();
//    //String B = scanner.nextLine();
//    
//    reverse(A);
//    
//  }
}
