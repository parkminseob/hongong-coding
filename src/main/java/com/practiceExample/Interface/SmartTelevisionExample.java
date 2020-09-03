package com.practiceExample.Interface;

public class SmartTelevisionExample {
  public static void main(String[] args) {
    SmartTelevison tv = new SmartTelevison();

    RemoteControl rc = tv;
    Searchable searchable = tv;

    tv.turnOn();
    tv.turnOff();
    rc.setVolume(99);
  }
}
