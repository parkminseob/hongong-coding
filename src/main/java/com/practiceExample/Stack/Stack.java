package com.practiceExample.Stack;

import java.util.EmptyStackException;
import com.practiceExample.LinkedList.LinkedList;

public class Stack<E> extends LinkedList<E>{

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public E peek() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return get(size()-1);
  }

  public boolean empty() {
    return size()==0;
  }

  @Override
  protected Stack<E> clone() throws CloneNotSupportedException {
    Stack<E> newStack = new Stack<>();

    @SuppressWarnings("unchecked")
    E[] values = (E[])toArray();
    for(E value : values) {
      newStack.push(value);
    }
    return newStack;
  }
}
