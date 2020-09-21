package com.practiceExample;

public class Anonymous {
  RemoteControl field = new RemoteControl() {
    @Override
    public void turnOn() {
      System.out.println("TV On");
    }

    @Override
    public void turnOff() {
      System.out.println("TV Off");
    }
  };

  void method() {

    RemoteControl localVar = new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("Audio On");
      }

      @Override
      public void turnOff() {
        System.out.println("Audio Off");
      }
    };
    localVar.turnOn();
  }

  void method2(RemoteControl rc) {
    rc.turnOn();
  }
}
