package com.practiceExample.LinkedList.Stack;

public class MyStackTest {
  public static void main(String[] args) throws Exception{

    MyStack<String> stack = new MyStack<>();

    stack.add("aaa");
    stack.add("bbb");
    stack.add("ccc");
    stack.add("ddd");
    stack.add("eee");
    print(stack);

    MyStack<String> stack2 = stack.clone();
    print(stack2);

    System.out.println(stack2.pop());
    System.out.println(stack2.pop());
    System.out.println(stack2.pop());
    System.out.println(stack2.pop());
    print(stack2);

    System.out.println("-----");
    print(stack);
  }

  static void print(MyStack<?> stack) {
    for(int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + " ");
    }
    System.out.println();
  }
}
