package com.practiceExample.ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<E> {

  private final int DEFAULT_LENGTH = 5;
  private Object[] elementData;
  private int size;


  public ArrayList() {
    elementData = new Object[DEFAULT_LENGTH];
  }

  public ArrayList(int initialCapacity) {

    if(initialCapacity < DEFAULT_LENGTH) {
      elementData = new Object[DEFAULT_LENGTH];
    }
    elementData = new Object[initialCapacity];
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

    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값"); 
    }

    return (E) elementData[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E element) {

    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값"); 
    }

    Object oldElement = elementData[index];
    elementData[index] = element;
    return (E)oldElement;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {

    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값"); 
    }

    Object oldElement = elementData[index];

    System.arraycopy(elementData, index+1, elementData, index, size - (index+1));


    //    for(int i = index; i < size-1; i++) {
    //      elementData[i] = elementData[i+1]; 
    //    }

    size--;
    elementData[size] = null;
    return (E)oldElement;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, size);
    return arr;

    /*
    Object[] arr = new Object[size];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }*/
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {

    if(arr.length < size) {
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), size);
    }
    System.arraycopy(elementData, 0, arr, 0, size);


    //    for(int i = 0; i < size; i++) {
    //      arr[i] = (E) elementData[i];
    //    }
    return arr;
  }

  public int size() {
    return size;
  }
}
