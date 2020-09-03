package com.practiceExample.Interface;

public class MyClass {

  RemoteControl rc = new Television();

  MyClass() {

  }

  MyClass(RemoteControl rc) {
    this.rc = rc;
    rc.turnOn();
    rc.turnOff();
    rc.setVolume(6);
  }

  void methodA() {
    RemoteControl rc = new Audio();
    rc.turnOn();
    rc.setVolume(9);
  }

  void methodB(RemoteControl rc) {
    rc.turnOn();
    rc.setVolume(2);
  }
}
