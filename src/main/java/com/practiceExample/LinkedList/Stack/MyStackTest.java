package com.practiceExample.LinkedList.Stack;

public class MyStackTest {
  public static void main(String[] args) {
    
    MyStack stack = new MyStack();
    
    stack.add("aaa");
    stack.add("bbb");
    stack.add("ccc");
    System.out.println("==> " + stack.peek());
    stack.add("ddd");
    stack.add("eee");
    print(stack);
    
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println("==> " + stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
  
  static void print(MyStack stack) {
    for(int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + " ");
    }
    System.out.println();
  }
}
