package com.test;

import com.util.Cal;

public class PracticeCal {

  public static void main(String[] args) {
    //78 + 99 - 30 * 6 / 3

    Cal c1 = new Cal();
    c1.plus(78);
    c1.plus(99);
    c1.minus(30);
    c1.multiple(6);
    c1.divide(3);
    //가나다라마바사아 
    Cal.resultCal(c1.result);
  }

}
