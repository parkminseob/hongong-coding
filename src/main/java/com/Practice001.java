package com;
import java.util.Scanner;
public class Practice001 {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   int A;
   int B;
   
   A = scanner.nextInt();
   B = scanner.nextInt();
       
   
   if (A > B) {
     System.out.println(">");
   } else if (A < B) {
     System.out.println("<");
   } else
     System.out.println("==");
   
 }
}
