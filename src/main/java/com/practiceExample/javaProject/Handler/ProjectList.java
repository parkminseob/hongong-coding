package com.practiceExample.javaProject.Handler;

import com.practiceExample.javaProject.domain.Project;

public class ProjectList {

  final static int DEFAULT_CAPACITY = 100;
  int size = 0;
  Project[] list;

  public ProjectList() {
    list = new Project[DEFAULT_CAPACITY];
  }
  
  public ProjectList(int initialCapacity) {
    if(initialCapacity < DEFAULT_CAPACITY) {
      list = new Project[DEFAULT_CAPACITY];
    } else {
      list = new Project[initialCapacity];
    }
  }
  
  public void add(Project project) {
    list[size++] = project;
  }
  
  public Project[] toArray() {
    Project[] arr = new Project[size];
    for(int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
