package com.practiceExample.Doit.chap02;

public class CardConcRev {

  static int cardConvR(int x, int r, char[] d) {
    int digits = 0; //변환 후의 자릿수
    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    do {
      d[digits++] = dchar.charAt(x % r);
      x /= r;
    } while(x != 0);
    return digits;

  }
}
