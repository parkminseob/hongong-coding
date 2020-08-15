package com.practiceExample;

import java.util.Scanner;

public class Star02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int star = scanner.nextInt();

    for (int i = 1; i <= star; i++) {
     for (int j = 1; j <= i; j++) {

        System.out.print("*");
     }
     System.out.println();
    }



    scanner.close();
  }
}
