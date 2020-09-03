package com.practiceExample.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
  public static void main(String[] args) {
    Set<Member_a> set = new HashSet<Member_a>();

    set.add(new Member_a("홍길동", 30));
    set.add(new Member_a("홍길동", 30));

    System.out.println("총 객체수 : " + set.size());
  }
}
