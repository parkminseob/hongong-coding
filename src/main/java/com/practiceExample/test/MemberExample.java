package com.practiceExample.test;

public class MemberExample {
  public static void main(String[] args) {
    
    Member obj1 = new Member("blue");
    Member obj2 = new Member("blue");
    Member obj3 = new Member("red");
    
    if(obj1.equals(obj2)) {
      System.out.println("obj1과 obj2는 같습니다.");
    } else {
      System.out.println("obj1 과 obj2는 같지 않습니다.");
    }
    
    if(obj1.equals(obj3)) {
      System.out.println("obj1과 obj3은 같습니다.");
    } else {
      System.out.println("obj1과 obj3은 같지 않습니다.");
    }
  }
}
