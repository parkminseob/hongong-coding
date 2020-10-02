package com.practiceExample.LinkedList;

public class MyLinkedListTest {
  public static void main(String[] args) throws Exception {

    MyLinkedList<String> list = new MyLinkedList<>();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    print(list);

    list.set(1, "xxx");
    print(list);

    MyLinkedList<String> list2 = list.clone();
    list2.remove(1);
    print(list2);

    System.out.println("----------");

    print(list);
  }

  private static void print(MyLinkedList<?> list) {

    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
  }


}
