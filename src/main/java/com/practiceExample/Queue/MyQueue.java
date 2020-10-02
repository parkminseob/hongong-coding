package com.practiceExample.Queue;

import com.practiceExample.LinkedList.MyLinkedList;

public class MyQueue<E> extends MyLinkedList<E> {

  public boolean offer(E e) {
    return add(e);
  }

  public E poll() {
    if(size() == 0) {
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if(size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public MyQueue<E> clone() throws CloneNotSupportedException {
    MyQueue<E> newQueue = new MyQueue<>();
    Object[] values = toArray();
    for(Object value : values) {
      newQueue.offer((E)value);
    }
    return newQueue;
  }
}
