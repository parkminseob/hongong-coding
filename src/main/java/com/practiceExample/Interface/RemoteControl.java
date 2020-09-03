package com.practiceExample.Interface;

public interface RemoteControl {

  int MAX_VALUME = 10;
  int MIN_VALUME = 0;

  public void turnOn();
  public void turnOff();
  public void setVolume(int volume);
}
