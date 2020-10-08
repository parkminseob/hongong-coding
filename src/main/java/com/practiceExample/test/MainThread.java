package com.practiceExample.test;

public class MainThread {

  public static class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
      this.setName("User1");
      this.calculator = calculator;
    }

    @Override
    public void run() {
      calculator.setMemory(100);
    }
  }

  public static class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
      this.setName("User2");
      this.calculator = calculator;
    }

    @Override
    public void run() {
      calculator.setMemory(50);
    }
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    User1 user1 = new User1();
    user1.setCalculator(calculator);
    user1.start();

    User2 user2 = new User2();
    user2.setCalculator(calculator);
    user2.start();
  }
}
