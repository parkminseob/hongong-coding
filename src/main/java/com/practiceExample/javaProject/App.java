package com.practiceExample.javaProject;

import java.util.Scanner;
import java.sql.Date;

public class App {
  
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registerDate;
  }
  static int size = 0;
  static final int LENGTH = 5;
  static Member[] members = new Member[LENGTH];
  
  public static void main(String[] args) {
    System.out.println("[회원]");
    
    inputMember();
    
    System.out.println("-------------------------------");
    
    printMember();
  }
  
  static void inputMember() {
    Scanner scanner = new Scanner(System.in);

    for(int i = 0; i < LENGTH; i++) {
      Member member = new Member();
      
      System.out.print("번호? ");
      member.no = Integer.parseInt(scanner.nextLine());

      System.out.print("이름? ");
      member.name = scanner.nextLine();
      
      System.out.print("이메일? ");
      member.email = scanner.nextLine();
      
      System.out.print("암호? ");
      member.password = scanner.nextLine();
      
      System.out.print("사진? ");
      member.photo = scanner.nextLine();
      
      System.out.print("전화? ");
      member.tel = scanner.nextLine();
      
      member.registerDate = new java.sql.Date(System.currentTimeMillis());
      
      members[size++] = member;
      
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = scanner.nextLine();
      
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }
  }
  
  static void printMember() {
    for(int i = 0; i < size; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.name, m.email, m.tel, m.registerDate);
    }
  }
}
