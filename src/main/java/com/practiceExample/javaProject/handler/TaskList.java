package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Task;

public class TaskList {

  static final int LENGTH = 100;
  Task[] list;
  int size = 0;


  public TaskList() {
    list = new Task[LENGTH];
  }

  public TaskList(int initialCapacity) {
    if(initialCapacity < LENGTH) {
      list = new Task[LENGTH];
    }
    list = new Task[initialCapacity];
  }
  
  public Task[] toArray() {
    Task[] arr = new Task[size];
    for(int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
  
  public void add(Task task) {
    list[size++] = task;
  }
}
