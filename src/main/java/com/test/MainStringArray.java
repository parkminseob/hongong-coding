package com.test;

public class MainStringArray {
 public static void main(String[] args) {
   
   if(args.length != 2) {
     System.out.println("값의 수가 부족하다!");
     System.exit(0);
   }
   
   String n1 = args[0];
   String n2 = args[1];
   
   int i1 = Integer.parseInt(n1);
   int i2 = Integer.parseInt(n2); //문자열을 정수로 변환.
   
  int result = i1 + i2;
  System.out.println(i1 + " + " + i2 + " = " + result);
   
 }
}
