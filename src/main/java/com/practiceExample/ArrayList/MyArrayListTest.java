package com.practiceExample.ArrayList;

public class MyArrayListTest {
  public static void main(String[] args) {

    MyArrayList<String> list = new MyArrayList<>();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    print(list);

    list.set(2, "xxx");
    print(list);

    list.remove(4);
    print2(list);

    System.out.println(list.get(4));

  }

  private static void print(MyArrayList<?> list) {
    for(int i = 0; i < list.size(); i++) {
      String str = (String)list.get(i);
      System.out.println(str + " ");
    }
    System.out.println();
  }

  private static void print2(MyArrayList<?> list) {
    for(int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + " ");
    }
    System.out.println();
  }
}
