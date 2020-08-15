package com.practiceExample;

import java.util.Scanner;

public class Star01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("별 개수 입력");
    int star = scanner.nextInt();

    for (int i = 1; i <= star; i++) {
     for (int j = star; j > 0; j--) {
       if (j > i) {
         System.out.print(" ");
       } else {
         System.out.print("*");
       }
     }
     System.out.println();
    }
    scanner.close();
  }
}
