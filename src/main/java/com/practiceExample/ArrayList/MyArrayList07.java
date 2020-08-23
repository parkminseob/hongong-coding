package com.practiceExample.ArrayList;

// 1) 인스턴스/객체의 주소를 담을 레퍼런스 배열을 준비한다.
// 2) 인스턴스를 추가하는 add() 메서드 정의 
// 3) 특정 인덱스의 인스턴스를 리턴하는 get(int)메서드를 정의한다.
// 4) 인스턴스의 특정 위치에 삽입하는 add(int, Object)메서드를 정의한다.
// 5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int, Object)메서드를 정의한다.
// 6) 특정 위치의 항목을 제거하는 remove(int)메서드를 정의한다.
//
// 테스트2 - MyArrayListTest2
// 7) add()할 때 배열의 크기를 넘는 경우, 배열의 크기를 늘린다.
//    add(int,Object)로 임의의 위치에 삽입할 때
//    - 배열의 크기가 작으면 늘린다.
//    - 인덱스가 유효하지 않으면 예외를 발생시킨다.
public class MyArrayList07 {
  static Object[] elementData = new Object[5];
  static int size;
  
  static public boolean add(Object e) {
    if(elementData.length == size) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }
  
  static public void add(int index, Object element) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }
    if(elementData.length == size) {
      grow();
    }
    for(int i = size; i > index; i--) {
      elementData[i] = elementData[i-1];
    }
      elementData[index] = element;
      size++;
  }
  
  static public void grow() {
    System.out.println("배열을 늘렸습니다.");
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for(int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
  }
  
  static public Object get(int index) {
    return elementData[index];
  }
  
  static public Object set(int index, Object element) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
      Object old = elementData[index];
      elementData[index] = element;
      return old;
  }
  
  static public Object remove(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Object old = elementData[index];
    for(int i = index; i < size-1; i++) {
      elementData[i] = elementData[index+1];
    }
    size--;
    return old;
  }
}
