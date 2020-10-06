package com.practiceExample.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
  public static void main(String[] args) throws Exception {
    PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("C:/Temp/printStream.txt")));

    out.println("[프린터 보조 스트림]");
    out.println("마치");
    out.println("프린터처럼 출력된다.");
    out.println("야호! 난 자바가 정말 좋아~!");

    out.flush();
    out.close();
  }
}
