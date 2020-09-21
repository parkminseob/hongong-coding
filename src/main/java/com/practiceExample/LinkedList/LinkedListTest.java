package com.practiceExample.LinkedList;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add(1, "xxx");

    print(list);

    list.remove(2);
    print(list);

    list.set(2, "yyy");
    print(list);
  }

  public static void print(LinkedList list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
  }

  public static void print2(Object[] arr) {
    for(Object obj : arr) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }
}
