package com.practiceExample.LinkedList;

// 1) LinkedList 클래스 정의  
// 2) 값을 담을 노드 클래스 설계
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add()메서드 정의.
// 5) 목록에 값을 조회하는 get()메서드 정의.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object)메서드 정의
//    - Node생성자 추가
// 7) 목록에서 특정 인덱스의 값을 제거하는 remove(int) 메서드 정의
// 8) 목록에서 특정 인덱스의 값을 바꾸는 set(int, Object)메서드를 정의한다.
public class MyLinkedList08 {
 
  // Node 클래스란?
  // 목록에서 각 항목의 값을 보관하는 객체 역할을 수행한다.
  // 여러 개의 MyLinkedList 객체가 공유하는 클래스이므로
  // 스태틱으로 Node 클래스를 설계한다.
  Node first; 
  Node last;
  int size; //목록크기 보관 
  
  static class Node{
    Object value;
    Node next;
  
  public Node() {}
  
  public Node(Object value) {
    this.value = value;
  }
  }
  
  public boolean add(Object e) {
    Node node = new Node();
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
  
  public Object get(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    Node cursor = this.first;
    for(int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }
  
  public void add(int index, Object element) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    size++;
    Node node = new Node(element);
    
    if(index == 0) {
      node.next = first;
      first = node;
      return;
    }
    
    Node cursor = this.first;
    for(int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    node.next = cursor.next;
    cursor.next = node;

    if(node.next == null) {
      last = node;
    }
  }
  
  public Object remove(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    size--;

    if(index == 0) {
      Node old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }
    
    Node cursor = first;
    for(int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;
    
    if(cursor.next == null) {
      last = cursor;
    }
    return old.value;
  }
  
  public Object set(int index, Object element) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값");
    }
    Node cursor = first;
    for(int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    Object old = cursor.value;
    cursor.value = element;

    return old;
    
  }
}



















