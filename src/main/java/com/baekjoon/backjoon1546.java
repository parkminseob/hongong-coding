package com.baekjoon;
import java.util.Scanner;
public class backjoon1546 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int num = scanner.nextInt();
    double[] arr = new double[num];
    double max = 0;
    double aver = 0;
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
      if(arr[i] > max) {
        max = arr[i];
      }
    } //최대값 구하기 
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = arr[i]/max*100;
      aver += arr[i];
    }
    System.out.println(aver/num);
  }
}
