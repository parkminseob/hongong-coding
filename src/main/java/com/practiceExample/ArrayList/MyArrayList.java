package com.practiceExample.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
  private static final int DEFALUT_LENGTH = 5;
  private Object[] elementData;
  private int size;

  public MyArrayList() {
    elementData = new Object[DEFALUT_LENGTH];
  }

  public MyArrayList(int initialCapacity) {
    if(initialCapacity < elementData.length) {
      elementData = new Object[DEFALUT_LENGTH];
    } else {
      elementData = new Object[initialCapacity];
    }
  }

  public boolean add(E e) {
    if(size == elementData.length) {
      grow();
    }

    elementData[size++] = e;
    return true;
  }
  public void add(int index, E element) {
    if(size == elementData.length) {
      grow();
    }

    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }

    for(int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  private void grow() {
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
    /*
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for(int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
     */
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    return (E) elementData[index];
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    E old = (E) elementData[index];

    System.arraycopy(elementData, index+1, elementData, index, size - (index +1));

    /*
    for(int i = index; i < size-1; i++) {
      elementData[i] = elementData[i + 1];
    }
     */
    size--;
    elementData[size] = null;
    return old;
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E element) {
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    E oldElement = (E) elementData[index];
    elementData[index] = element;
    return oldElement;
  }

  public int size() {
    return size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, size);
    /*
    Object[] arr = new Object[this.size];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }
     */
    return arr;
  }

  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
    System.arraycopy(this.elementData, 0, arr, 0, this.size);
    return arr;
  }
}
