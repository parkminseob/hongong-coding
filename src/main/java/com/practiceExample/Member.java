package com.practiceExample;

public class Member {
  public String id;
  
  public Member(String id) {
    this.id = id;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) { //매개값이 Member타입인지 확인한다.
      // Member타입으로 강제 타입변환하고 id 필드값이 동일한지 검사 한 후
      // 동일하다면 true를 리턴한다.
      Member member = (Member) obj;
      if(id.equals(member.id)) {
        return true;
      }
    }
    return false; // 매개값이 Member 타입이 아니거나 id필드값이 다른 경우 false를 리턴한다.
  }
}
