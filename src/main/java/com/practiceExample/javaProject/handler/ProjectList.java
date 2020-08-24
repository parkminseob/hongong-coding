package com.practiceExample.javaProject.handler;

import com.practiceExample.javaProject.domain.Project;

public class ProjectList {

  static final int LENGTH = 100;
  Project[] list = new Project[LENGTH]; 
  int size = 0;


  public ProjectList() {
    list = new Project[LENGTH];
  }

  public ProjectList(int initialCapacity) {
    if(initialCapacity < LENGTH) {
      list = new Project[LENGTH];
    }
    list = new Project[initialCapacity];
  }
  
  public Project[] toArray() {
    Project[] project = new Project[size];
    for(int i = 0; i < size; i++) {
      project[i] = list[i];
    }
    return project;
  }
  
  public void add(Project project) {
    list[size++]= project;
  }
}
