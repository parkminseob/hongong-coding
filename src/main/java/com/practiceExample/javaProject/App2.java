package com.practiceExample.javaProject;

import java.util.Scanner;
import java.sql.Date;

public class App2 {

  static class Project{
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String member;
  }

  final static int LENGTH = 5;
  static int size = 0;
  static Project[] projects = new Project[LENGTH];

  public static void main(String[] args) {

    System.out.println("[프로젝트]");
    inputProject();

    System.out.println("--------------------");

    printProject();
  }

  public static void inputProject() {
    Scanner scanner = new Scanner(System.in);
    Project project = new Project();

    for(int i = 0; i < LENGTH; i++) {

      System.out.print("번호? ");
      project.no = Integer.parseInt(scanner.nextLine());

      System.out.print("프로젝트명? ");
      project.title = scanner.nextLine();

      System.out.print("내용? ");
      project.content = scanner.nextLine();

      System.out.print("시작일? ");
      project.startDate = Date.valueOf(scanner.nextLine());

      System.out.print("종료일? ");
      project.endDate = Date.valueOf(scanner.nextLine());

      System.out.print("만든이? ");
      project.owner = scanner.nextLine();

      System.out.print("팀원? ");
      project.member = scanner.nextLine();

      projects[size++] = project;

      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();

      if(!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }
  }
  
  public static void printProject() {
    for(int i = 0; i < size; i++) {
      Project p = projects[i];
      
      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }
}
