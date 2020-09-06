package com.practiceExample.LinkedList;

public class MyLinkedListTest {
  public static void main(String[] args) {

    MyLinkedList<String> linkedList = new MyLinkedList<>();

    linkedList.add("aaa");
    linkedList.add("bbb");
    linkedList.add("ccc");
    linkedList.add("ddd");

    System.out.println(linkedList.get(0));
    System.out.println(linkedList.get(1));
    System.out.println(linkedList.get(2));
    System.out.println(linkedList.get(3));
    //System.out.println(linkedList.get(-1));
    System.out.println("-------------------");

    print(linkedList);

    System.out.println("-------------------");
    linkedList.add(2, "xxx");
    print(linkedList);

    System.out.println("-------------------");
    linkedList.remove(3);
    print(linkedList);

    System.out.println("-------------------");
    linkedList.set(1, "yyy");
    print(linkedList);
    print2(linkedList.toArray());
  }

  public static void print(MyLinkedList<?> list) {
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
  }

  public static void print2(Object[] list) {
    for(Object arr : list) {
      System.out.print(arr + " ");
    }
    System.out.println();
  }
}
