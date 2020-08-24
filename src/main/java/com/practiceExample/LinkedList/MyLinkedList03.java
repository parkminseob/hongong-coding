package com.practiceExample.LinkedList;

// 1) LinkedList 클래스 정의  
// 2) 값을 담을 노드 클래스 설계
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
public class MyLinkedList03 {
 
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
  }
}
