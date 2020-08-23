package com.practiceExample.ArrayList;

public class MyArrayListTest01 {
  public static void main(String[] args) {
    MyArrayList.add("aaa");
    MyArrayList.add("bbb");
    MyArrayList.add("ccc");
    MyArrayList.add("ddd");
    print();
    
    System.out.println("----------");
    MyArrayList.add(1, "xxx");
    print();
    
    System.out.println("----------");
    MyArrayList.set(2, "yyy");
    print();
    
    System.out.println("----------");
    MyArrayList.remove(3);
    print();
  }
  
  public static void print() {
    for(int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
