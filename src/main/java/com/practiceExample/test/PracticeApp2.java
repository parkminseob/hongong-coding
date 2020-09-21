package com.practiceExample.test;

import java.sql.Date;
import java.util.Scanner;

public class PracticeApp2 {
  public static void main(String[] args) {
    class Project {
      int no;
      String name;
      String content;
      Date stDate;
      Date edDate;
      String owner;
      String team;
    }

    Scanner scanner = new Scanner(System.in);

    final int MAX_LENGTH = 4;
    int count = 0;

    Project[] project = new Project[MAX_LENGTH];

    System.out.println("[프로젝트]");

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Project p = new Project();

      System.out.print("번호? ");
      p.no = Integer.parseInt(scanner.nextLine());

      System.out.print("프로젝트명? ");
      p.name = scanner.nextLine();

      System.out.print("내용? ");
      p.content = scanner.nextLine();

      System.out.print("시작일? ");
      p.stDate = Date.valueOf(scanner.nextLine());

      System.out.print("종료일? ");
      p.edDate = Date.valueOf(scanner.nextLine());

      System.out.print("만든이? ");
      p.owner = scanner.nextLine();

      System.out.print("팀원? ");
      p.team = scanner.nextLine();

      System.out.println();

      project[i] = p;

      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
        }
      }
    scanner.close();

    System.out.println("--------------------");
    for (int i = 0; i < count; i++) {
      Project p = project[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          p.no,
          p.name,
          p.stDate,
          p.edDate,
          p.owner);
    }
 }
}