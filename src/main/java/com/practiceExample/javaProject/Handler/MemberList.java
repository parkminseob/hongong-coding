package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Member;

public class MemberList {

  static final int DEFALUT_CAPACITY = 100;
  int size = 0;
  Member[] list;

  public MemberList() {
    list = new Member[DEFALUT_CAPACITY];
  }
  
  public MemberList(int initialCapacity) {
    if(initialCapacity <= DEFALUT_CAPACITY) {
      list = new Member[DEFALUT_CAPACITY];
    } else {
      list = new Member[initialCapacity];
    }
  }
  
  public void add(Member member) {
    list[size++] = member;
  }
  
  public Member[] toArray() {
    Member[] arr = new Member[size];
    for(int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
