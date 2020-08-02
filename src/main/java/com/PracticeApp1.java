package com;

import java.sql.Date;
import java.util.Scanner;

public class PracticeApp1 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    final int MAX_LENGTH = 4;
    System.out.println("[회원]");
    
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];
    
    long currentMillis = 0;
    int count = 0;
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      
      System.out.print("번호? ");
      no[i] = Integer.parseInt(scanner.nextLine());
      // 문자열을 입력받아도 primative data type을 출력한다.
      
      
      System.out.print("이름? ");
      name[i] = scanner.nextLine();
      
      System.out.print("이메일? ");
      email[i] = scanner.nextLine();
      
      System.out.print("암호? ");
      password[i] = scanner.nextLine();
      
      System.out.print("사진? ");
      photo[i] = scanner.nextLine();
      
      System.out.print("전화? ");
      tel[i] = scanner.nextLine();
      
      currentMillis = System.currentTimeMillis();
      now[i] = new Date(currentMillis);
      
      System.out.println();
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    
    
    scanner.close();
    
    System.out.println("-----------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], name[i], email[i], tel[i], now[i]);
    }
  }
}
