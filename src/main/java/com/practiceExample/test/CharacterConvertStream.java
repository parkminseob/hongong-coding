package com.practiceExample.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStream {
  public static void main(String[] args) throws Exception {
    write("문자 변환 스트림 사용.");
    String data = read();
    System.out.println(data);
  }

  static void write(String str) throws Exception {
    Writer writer = new OutputStreamWriter(new FileOutputStream("C:/Temp/test1.txt"));
    writer.write(str);
    writer.flush();
    writer.close();
  }

  static String read() throws Exception {
    Reader reader = new InputStreamReader(new FileInputStream("C:/Temp/test1.txt"));
    char[] buf = new char[100];
    int readChar = reader.read(buf);
    reader.close();
    String data = new String(buf, 0, readChar);
    return data;
  }
}
