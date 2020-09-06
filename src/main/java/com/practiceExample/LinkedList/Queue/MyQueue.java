package com.practiceExample.LinkedList.Queue;

import com.practiceExample.LinkedList.MyLinkedList;

// 1) Queue 를 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 2) Queue에 값을 추가하는 offer(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
// 5) Queue.clone() 오버라이딩 : deep copy
// 6) 제네릭 적용
public class MyQueue<E> extends MyLinkedList<E>{

  public boolean offer (E e) {
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
  protected MyQueue<E> clone() throws CloneNotSupportedException {
    MyQueue<E> newQueue = new MyQueue<>();
    Object[] values = this.toArray();
    for(Object value : values) {
      newQueue.offer((E)value);
    }
    return newQueue;
  }
}
