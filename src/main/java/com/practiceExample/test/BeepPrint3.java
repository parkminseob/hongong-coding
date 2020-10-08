package com.practiceExample.test;

import java.awt.Toolkit;

public class BeepPrint3 {

  public static void main(String[] args) {
    new Thread(() -> {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for(int i = 0; i < 5; i++) {
        toolkit.beep();
        try {Thread.sleep(500);} catch(Exception e) {}
      }
    }).start();;

    for(int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {Thread.sleep(500);} catch(Exception e) {}
    }
  }
}