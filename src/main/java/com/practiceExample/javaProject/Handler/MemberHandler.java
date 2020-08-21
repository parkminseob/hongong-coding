package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Member;
import com.practiceExample.javaProject.util.Prompt;

public class MemberHandler {

  MemberList memberList = new MemberList();
  public void list() {
    
    System.out.println("[회원 목록]");
    Member[] members = memberList.toArray();
    for(Member m : members) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.name, m.email, m.tel, m.registerDate);
    }
  }

  public void add() {
    System.out.println("[회원 등록]");
    Member member = new Member();
    member.no = Prompt.promptInt("번호? ");
    member.name = Prompt.promptString("이름? ");
    member.email = Prompt.promptString("이메일? ");
    member.password = Prompt.promptString("암호? ");
    member.photo = Prompt.promptString("사진? ");
    member.tel = Prompt.promptString("전화? ");
    member.registerDate = new java.sql.Date(System.currentTimeMillis());
    
    System.out.println("[회원 등록을 완료했습니다.]");
    memberList.add(member);
  }
  
  public Member findByName (String name) {
    Member[] m = memberList.toArray(); 
    for (Member members : m) {
      if(members.name.equals(name)) {
        return members;
      }
    }
    return null;
  }
}
