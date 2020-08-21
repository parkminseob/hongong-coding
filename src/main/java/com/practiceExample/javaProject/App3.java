package com.practiceExample.javaProject;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  static class Task{
    int no;
    String content;
    Date endDate;
    int status;
    String owner;
    String project;
  }

  final static int LENGTH = 5;
  static int size = 0;
  static Task[] tasks = new Task[LENGTH];

  public static void main(String[] args) {

    inputTask();

    System.out.println("---------------------");

    printTask();
  }

  static void inputTask() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String project = scanner.nextLine();

    for(int i = 0; i < LENGTH; i++) {
      Task task = new Task();

      System.out.print("번호? ");
      task.no = scanner.nextInt();
      scanner.nextLine();

      System.out.print("내용? ");
      task.content = scanner.nextLine();

      System.out.print("완료일? ");
      task.endDate = Date.valueOf(scanner.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      task.status = Integer.valueOf(scanner.nextLine());

      System.out.print("담당자? ");
      task.owner = scanner.nextLine();

      tasks[size++] = task;
      
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }
  }
  
  static void printTask() {
    //System.out.printf("[프로젝트%s\n]", project);
    for(int i = 0; i < size; i++) {
      Task t = tasks[i];
      
      String statusLable = null;
      switch(t.status) {
        case 1: statusLable = "진행중"; break;
        case 2: statusLable = "신규"; break;
        default : statusLable = "완료";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          t.no, t.content, t.endDate, statusLable, t.owner);
    }
  }
}


















