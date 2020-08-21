package com.practiceExample.javaProject.Handler;

import java.sql.Date;
import com.practiceExample.javaProject.util.Prompt;

public class MemberHandler {

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
  static Member[] list = new Member[LENGTH];

  public static void list() {
    
    System.out.println("[회원 목록]");
    for(int i = 0; i < size; i++) {
      Member m = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.name, m.email, m.tel, m.registerDate);
    }
  }

  public static void add() {
    Member member = new Member();

    System.out.println("[회원 등록]");
    member.no = Prompt.promptInt("번호? ");
    member.name = Prompt.promptString("이름? ");
    member.email = Prompt.promptString("이메일? ");
    member.password = Prompt.promptString("암호? ");
    member.photo = Prompt.promptString("사진? ");
    member.tel = Prompt.promptString("전화? ");
    member.registerDate = new java.sql.Date(System.currentTimeMillis());
    list[size++] = member;
  }
  
  public static Member findByName (String name) {
    for (int i = 0; i < size; i++) {
      Member m = list[i];
      if(m.name.equals(name)) {
        return m;
      }
    }
    return null;
  }
}
