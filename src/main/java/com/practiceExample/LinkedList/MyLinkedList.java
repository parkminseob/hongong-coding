package com.practiceExample.LinkedList;

import java.lang.reflect.Array;

public class MyLinkedList<E> implements Cloneable {

  private Node<E> first;
  private Node<E> last;
  private int size;

  static class Node<E> {
    Node<E> next;
    E value;

    public Node() {}

    public Node(E value) {
      this.value = value;
    }
  }

  public boolean add(E e) {
    Node<E> node = new Node<>();
    node.value = e;
    if(first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;

    size++;

    return true;
  }

  public void add(int index, E element) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    Node<E> node = new Node<E>(element);

    size++;

    if(index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node<E> cursor = first;
    for(int i = 1; i <= index-1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if(node.next == null) {
      last = node;
    }
  }

  public E get(int index) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    Node<E> cursor = this.first;
    for(int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public E set(int index, E element) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }

    Node<E> cursor = first;
    for(int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    E old = cursor.value;
    cursor.value = element;

    return old;
  }

  public E remove(int index) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }

    size--;
    if(index == 0) {
      Node<E> old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }

    Node<E> cursor = first;
    for(int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    Node<E> old = cursor.next;
    cursor.next = old.next;
    old.next = null;

    if(cursor.next == null) {
      last = cursor;
    }

    return old.value;
  }

  public Object[] toArray() {
    Object[] arr = new Object[size];

    int i = 0;
    Node<E> cursor = first;

    while(cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if(arr.length < size) {
      Class<?> arrayClassInfo = arr.getClass();
      Class<?> arrayItemClassInfo = arrayClassInfo.getComponentType();

      arr = (E[]) Array.newInstance(arrayItemClassInfo, size);
    }

    Node<E> cursor = first;
    for(int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }
    return arr;

  }

  @Override
  public MyLinkedList<E> clone() throws CloneNotSupportedException{
    MyLinkedList<E> newList = new MyLinkedList<>();
    Object[] values = this.toArray();
    for(Object value : values) {
      newList.add((E)value);
    }
    return newList;
  }

  public int size() {
    return size;
  }
}
