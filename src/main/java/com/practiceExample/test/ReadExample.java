package com.practiceExample.test;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
  public static void main(String[] args) throws Exception {
    Reader reader = new FileReader("C:/Temp/test8.txt");

    char[] buf = new char[5];

    while(true) {
      int readChar = reader.read(buf, 2, 3);
      if(readChar == -1) {
        break;
      }
      for(int i = 0; i < buf.length; i++) {
        System.out.println(buf[i]);
      }
    }
    reader.close();
  }
}
