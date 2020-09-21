package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Member;
import com.practiceExample.javaProject.util.Prompt;

public class MemberHandler {

  MemberList memberList = new MemberList();
  // 다른 패키지에서 이 메서드를 사용할 수 있도록 public 으로 사용 범위를 공개한다.
  public void add() {
    System.out.println("[회원 등록]");
    
    Member member = new Member();
    member.no = Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email = Prompt.inputString("이메일? ");
    member.password = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registeredDate = new java.sql.Date(System.currentTimeMillis());
    
    memberList.add(member);
  }
  
  public void list() {
    System.out.println("[회원 목록]");
    
    Member[] m = memberList.toArray();
    for (Member member : m) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          member.no, 
          member.name, 
          member.email, 
          member.tel, 
          member.registeredDate);
    }
  }
  
  public Member findByName(String name) {
    Member[] m = memberList.toArray();
    for(Member members : m) {
      if(members.name.equals(name)) {
        return members;
      }
    }
    return null;
  }
}
