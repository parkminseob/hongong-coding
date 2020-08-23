package com.practiceExample.test;

import java.util.Scanner;
import java.sql.Date;

public class PracticeApp3 {
  public static void main(String[] args) {
    class Task {
      int no;
      String content;
      Date edDate;
      String owner;
      int state;
    }
    
    Scanner scanner = new Scanner(System.in);
    
    final int MAX_LENGTH = 4;
    Task[] task = new Task[MAX_LENGTH];
    
    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String project = scanner.nextLine();
   
    int count = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {

      Task t = new Task();
      
      System.out.print("번호? ");
      t.no = Integer.parseInt(scanner.nextLine());
      
      System.out.print("내용? ");
      t.content = scanner.nextLine();
      
      System.out.print("완료일? ");
      t.edDate = Date.valueOf(scanner.nextLine());
      
      System.out.println("상태? ");
      System.out.println("0 : 신규 ");
      System.out.println("1 : 진행중 ");
      System.out.println("2 : 완료 ");
      System.out.println("> ");
      t.state = Integer.parseInt(scanner.nextLine());
      
      System.out.println("담당자? ");
      t.owner = scanner.nextLine();
      
      count++;
      System.out.println();
      
      task[i] = t;
      
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
      
      Task t = task[i];
      
      String stateMent = null;
      switch (t.state) {
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
          t.no,
          t.content,
          t.edDate,
          stateMent,
          t.owner);
    }
    }
}
  

