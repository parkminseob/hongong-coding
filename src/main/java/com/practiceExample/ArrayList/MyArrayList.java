package com.practiceExample.ArrayList;

import java.util.Arrays;

// 1) 인스턴스/객체의 주소를 담을 레퍼런스 배열을 준비한다.
// 2) 인스턴스를 추가하는 add() 메서드 정의 
// 3) 특정 인덱스의 인스턴스를 리턴하는 get(int)메서드를 정의한다.
// 4) 인스턴스의 특정 위치에 삽입하는 add(int, Object)메서드를 정의한다.
// 5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int, Object)메서드를 정의한다.
// 6) 특정 위치의 항목을 제거하는 remove(int)메서드를 정의한다.
//
// 테스트2 - MyArrayListTest2
// 7) add()할 때 배열의 크기를 넘는 경우, 배열의 크기를 늘린다.
//  add(int,Object)로 임의의 위치에 삽입할 때
//  - 배열의 크기가 작으면 늘린다.
//  - 인덱스가 유효하지 않으면 예외를 발생시킨다.
// 8) get(int)로 유효하지 않은 인덱스 값을 꺼낼 때 예외를 발생시킨다.
// 9) remove()를 수행한 다음에 맨 끝에 남아있는 주소를 null로 초기화한다.
// 
// 테스트3 - MyArrayListTest3
// 10) 여러 개의 목록을 동시에 관리할 수 있도록 
//     MyArrayList에 선언된 레퍼런스 배열을 스태틱 대신 인스턴스로 전환한다.
//     개별적으로 관리해야 할 데이터는 인스턴스 변수를 사용해야 한다.
// 11) 캡슐화 적용하여 공개할 멤버와 공개하지 말아야 할 멤버를 구분한다.
// 12) ArrayList 인스턴스를 생성할 때 배열의 초기 크기를 설정할 수 있도록 생성자를 추가한다.
// 13) 배열 크기를 지정할 때 기본 크기보다 큰 값이 되도록 조건식을 설정한다.
// 14) 배열의 기본 크기를 직접 숫자로 지정하지말고 상수를 사용한다.
// 15) 배열의 크기를 늘릴 때 자바에서 제공하는 Arrays를 사용한다.
// 16) ArrayList에 보관되어 있는 인스턴스 목록을 배열로 리턴하는 toArray메서드 정의한다.
public class MyArrayList {
  final static int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size;

  public MyArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayList(int initialCapacity) {
    if(initialCapacity < DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }

  public boolean add(Object e) {
    if(elementData.length == size) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  public void add(int index, Object element) {
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값!");
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

  private void grow() {
    System.out.println("배열을 늘렸습니다.");
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
//    for(int i = 0; i < elementData.length; i++) {
//      newArray[i] = elementData[i];
//    }
//    elementData = newArray;
  }

  public Object get(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값!");
    }

    return elementData[index];
  }

  public Object set(int index, Object element) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값!");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  public Object remove(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("유효하지 않은 인덱스 값!");
    }

    Object old = elementData[index];
    System.arraycopy(elementData, index+1, elementData, index, this.size - (index +1 ));
    
//    
//    for(int i = index; i < size-1; i++) {
//      elementData[i] = elementData[i+1];
//    }
    size--;
    elementData[size] = null;
    return old;
  }

  public int size() {
    return this.size;
  }
  
  public Object[] toArray() {
    Object[] arr = new Object[this.size];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }
    return arr;
  }
}
