package com;

import java.util.Scanner;
import java.sql.Date;

public class PracticeApp3 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    final int MAX_LENGTH = 4;
    
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] edDate = new Date[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];
    int[] state = new int[MAX_LENGTH];
    
    
    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String project = scanner.nextLine();
   
    int count = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(scanner.nextLine());
      
      System.out.print("내용? ");
      content[i] = scanner.nextLine();
      
      System.out.print("완료일? ");
      edDate[i] = Date.valueOf(scanner.nextLine());
      
      System.out.println("상태? ");
      System.out.println("0 : 신규 ");
      System.out.println("1 : 진행중 ");
      System.out.println("2 : 완료 ");
      System.out.println("> ");
      state[i] = Integer.valueOf(scanner.nextLine());
      
      System.out.println("담당자? ");
      owner[i] = scanner.nextLine();
      
      count++;
      System.out.println();
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
      
      }
    scanner.close();
    
    System.out.println("----------------------");
    System.out.printf("[%s]\n" , project);
    for (int i = 0; i < count; i++) {
      
      String stateMent = null;
      switch (state[i]) {
      case 1 : 
        stateMent = "진행중";
        break;
      case 2 : 
        stateMent = "완료";
        break;
      default : 
        stateMent = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], content[i], edDate[i], stateMent, owner[i]);
    }
    }
}
  

