package com.practiceExample.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();

    // Java는 한 번만 저장된다.
    set.add("Java");
    set.add("JDBC");
    set.add("Servlet/JSP");
    set.add("Java");
    set.add("iBATIS");

    int size = set.size(); // 저장된 객체 수 얻기
    System.out.println("총 객체수: "+ size);

    Iterator<String> iterator = set.iterator(); // 반복자 얻기
    while(iterator.hasNext()) { // 객체 수 만큼 반복문을 돌린다.
      String element = iterator.next(); // 1개의 객체를 가져옴 
      System.out.println("\t" + element);
    }

    set.remove("JDBC"); // 1개의 객체 삭제
    set.remove("iBATIS"); // 1개의 객체 삭제

    System.out.println("총 객체수: "+ set.size()); //저장된 객체 수 얻기 

    iterator = set.iterator(); // 반복자 얻기 
    for(String element : set) { // 객체 수 만큼 반복문 돌리기
      System.out.println("\t" + element);
    }

    set.clear(); // 모든 객체를 제거하고 비움 
    if(set.isEmpty()) {
      System.out.println("비어 있음");
    }
  }
}
