package com;

import java.util.Scanner;
import java.sql.Date;

public class PracticeApp2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    final int MAX_LENGTH = 4;
    
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] stDate = new Date[MAX_LENGTH];
    Date[] edDate = new Date[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];
    String[] team = new String[MAX_LENGTH];
    
    int count = 0;
    
    System.out.println("[프로젝트]");
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      
      System.out.print("번호? ");
      no[i] = Integer.parseInt(scanner.nextLine());
      
      System.out.print("프로젝트명? ");
      name[i] = scanner.nextLine();
      
      System.out.print("내용? ");
      content[i] = scanner.nextLine();
      
      System.out.print("시작일? ");
      stDate[i] = java.sql.Date.valueOf(scanner.nextLine());
      
      System.out.print("종료일? ");
      edDate[i] = java.sql.Date.valueOf(scanner.nextLine());
      
      System.out.print("만든이? ");
      owner[i] = scanner.nextLine();
      
      System.out.print("팀원? ");
      team[i] = scanner.nextLine();
      
      System.out.println();
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
        }
      }
    scanner.close();
    
    System.out.println("--------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], name[i], stDate[i], edDate[i], owner[i]);
    }
 }
}