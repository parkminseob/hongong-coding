package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Member;

public class MemberList {

  static final int LENGTH = 100;
  Member[] list;
  int size = 0;

  public MemberList() {
    list = new Member[LENGTH];
  }

  public MemberList(int initialCapacity) {
    if(initialCapacity < LENGTH) {
      list = new Member[LENGTH];
    }
    list = new Member[initialCapacity];
  }
  
  public Member[] toArray() {
    Member[] members = new Member[size];
    for(int i = 0; i < size; i++) {
      members[i] = list[i];
    }
    return members;
  }
  
  public void add(Member member) {
    list[size++] = member;
  }
}
