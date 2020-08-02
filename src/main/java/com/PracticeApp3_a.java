package com;

import java.sql.Date;
import java.util.Scanner;

public class PracticeApp3_a {
  public static void main(String[] args) {
    class Task {
      int no;
      String content;
      Date edDate;
      int status;
      String worker;
    }
    Scanner scanner = new Scanner(System.in);
    final int LENGTH = 100;
    
    System.out.println("[작업]");
    System.out.println("프로젝트? ");
    String project = scanner.nextLine();
    
    int count = 0;
    Task[] task = new Task[LENGTH];
    
    for (int i = 0; i < LENGTH; i++) {
      count++;
      Task t = new Task();
      
      System.out.print("번호? ");
      t.no = Integer.parseInt(scanner.nextLine());
      
      System.out.print("내용? ");
      t.content = scanner.nextLine();
      
      System.out.print("마감일? ");
      t.edDate = Date.valueOf(scanner.nextLine());
      
      System.out.println("상태? ");
      System.out.println("0 : 신규");
      System.out.println("1 : 진행중");
      System.out.println("2 : 완료");
      System.out.println("> ");
      t.status = Integer.parseInt(scanner.nextLine());
      
      System.out.print("담당자? ");
      t.worker = scanner.nextLine();
      
      System.out.println();
      task[i] = t;
      
      System.out.println("계속 입력 하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      
      }
       scanner.close();
      System.out.println("-------------------------");
      System.out.printf("[%s]\n" , project);
      
      for (int i = 0; i < count; i++) {
        Task t = task[i];
        String state = null;
        
        switch (t.status) {
          case 1 :
            state = "신규";
          case 2 :
            state = "진행중";
            default :
              state = "완료";
        }
        System.out.printf("%d, %s, %s, %s, %s\n",
            t.no,
            t.content,
            t.edDate,
            state,
            t.worker);
      }
    }
}
  

