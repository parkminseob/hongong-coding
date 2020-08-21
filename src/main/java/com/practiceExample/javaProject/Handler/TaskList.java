package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Task;

public class TaskList {

  final static int DEFALUT_CAPACITY = 100;
  int size = 0;
  Task[] list;
  
  public TaskList() {
    list = new Task[DEFALUT_CAPACITY];
  }
  
  public TaskList(int initialCapacity) {
    if(initialCapacity < DEFALUT_CAPACITY) {
      list = new Task[DEFALUT_CAPACITY];
    } else {
      list = new Task[initialCapacity];
    }
  }
  
  public void add(Task task) {
    list[size++] = task;
  }
  
  public Task[] toArray() {
    Task[] arr = new Task[size];
    for(int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
