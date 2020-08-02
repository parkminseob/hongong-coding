package com;

import java.sql.Date;
import java.util.Scanner;

public class PracticeApp1 {
  public static void main(String[] args) {
    class Members {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date now;
    }
    Scanner scanner = new Scanner(System.in);
    
    final int MAX_LENGTH = 4;
    Members[] members = new Members[MAX_LENGTH];
    
    
    System.out.println("[회원]");
    
    long currentMillis = 0;
    int count = 0;
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Members m = new Members();
      
      System.out.print("번호? ");
      m.no = Integer.parseInt(scanner.nextLine());
      // 문자열을 입력받아도 primitive data type을 출력한다.
      
      System.out.print("이름? ");
      m.name = scanner.nextLine();
      
      System.out.print("이메일? ");
      m.email = scanner.nextLine();
      
      System.out.print("암호? ");
      m.password = scanner.nextLine();
      
      System.out.print("사진? ");
      m.photo = scanner.nextLine();
      
      System.out.print("전화? ");
      m.tel = scanner.nextLine();
      
      currentMillis = System.currentTimeMillis();
      m.now = new Date(currentMillis);
      
      System.out.println();
      
      members[i] = m;
      
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    scanner.close();
    
    System.out.println("-----------------------");
    
    for (int i = 0; i < count; i++) {
      Members m = members[i];
      
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.no, 
          m.name, 
          m.email, 
          m.tel, 
          m.now);
    }
  }
}
