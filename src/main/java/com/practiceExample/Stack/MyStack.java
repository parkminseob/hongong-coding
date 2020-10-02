package com.practiceExample.Stack;

import java.util.EmptyStackException;
import com.practiceExample.LinkedList.MyLinkedList;

public class MyStack<E> extends MyLinkedList<E> {

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size()-1);
  }

  public E peek() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }

  public boolean empty() {
    return size() == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public MyStack<E> clone() throws CloneNotSupportedException {
    MyStack<E> newStack = new MyStack<E>();
    Object[] values = toArray();
    for(Object value : values) {
      newStack.push((E)value);
    }
    return newStack;
  }
}
