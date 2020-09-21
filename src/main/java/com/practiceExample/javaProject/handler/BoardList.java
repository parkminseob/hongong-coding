package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Board;

public class BoardList {
  final static int LENGTH = 100;
  Board[] list;
  int size = 0;

  public BoardList() {
    list = new Board[LENGTH];
  }

  public BoardList(int initialCapacity) {
    if(initialCapacity < LENGTH) {
      list = new Board[LENGTH];
    }
    list = new Board[initialCapacity];
  }

  public Board[] toArray() {
    Board[] arr = new Board[size];
    for(int i = 0; i < size; i ++) {
      arr[i] = list[i];
    }
    return arr;
  }
  
  public void add(Board board) {
    list[size++] = board;
  }
}
