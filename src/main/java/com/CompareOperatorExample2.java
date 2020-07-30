package com;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
      
      double v2 = 11.2;
      double v3 = 18.8;
      System.out.println(v2 == v3);
      
      double v4 = 14.4;
      double v5 = 15.6;
      System.out.println(v4 == v5);
      
      System.out.println((v2 + v3) == (v4 + v5));
      
      float f1 = 0.1f;
      float f2 = 0.1f;
      
      System.out.println((f1 + f2) == 0.01f);
      float r = f1 * f2 - 0.01f;
      
      System.out.println(Math.abs(r) < Float.POSITIVE_INFINITY);
      
    }
}
