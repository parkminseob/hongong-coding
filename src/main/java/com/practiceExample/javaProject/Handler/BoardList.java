package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Board;

public class BoardList {

  static final int DEFALUT_CAPACITY =100;
  int size = 0;
  Board[] list;
  
  public BoardList() {
    list = new Board[DEFALUT_CAPACITY];
  }
  
  public BoardList(int initialCapacity) {
    if(initialCapacity <= DEFALUT_CAPACITY) {
      list = new Board[DEFALUT_CAPACITY];
    } else {
      list = new Board[initialCapacity];
    }
  }
  
  public void add(Board board) {
    list[size++] = board;
  }
  
  public Board[] toArray() {
    Board[] arr = new Board[size];
    for(int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
  
}
