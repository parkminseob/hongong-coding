package com.practiceExample.Queue;

import com.practiceExample.LinkedList.LinkedList;

public class Queue<E> extends LinkedList<E> implements Cloneable{

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

  @Override
  protected Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newQueue = new Queue<E>();
    @SuppressWarnings("unchecked")
    E[] values = (E[])toArray();
    for(E value : values) {
      newQueue.offer(value);
    }
    return newQueue;
  }
}
