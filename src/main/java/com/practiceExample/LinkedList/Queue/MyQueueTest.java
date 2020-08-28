package com.practiceExample.LinkedList.Queue;

public class MyQueueTest {
  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    
    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    System.out.println("==> " + queue.peek());
    queue.offer("ddd");
    queue.offer("eee");
    print(queue);
    
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println("==> " + queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
  
  static void print(MyQueue queue) {
    for(int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + " ");
    }
    System.out.println();
  }
}
