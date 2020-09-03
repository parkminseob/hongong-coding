package com.practiceExample.Interface;

public class Audio implements RemoteControl{

  private int volume;

  @Override
  public void setVolume(int volume) {
    if(volume > RemoteControl.MAX_VALUME) {
      this.volume = MAX_VALUME;
    } else if(volume < RemoteControl.MIN_VALUME) {
      this.volume = MIN_VALUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 Audio 볼륨 : " + this.volume);
  }

  @Override
  public void turnOff() {
    System.out.println("Audio를 끕니다.");
  }

  @Override
  public void turnOn() {
    System.out.println("Audio를 켭니다.");
  }
}
