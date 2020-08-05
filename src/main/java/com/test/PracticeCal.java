package com.test;

import com.util.Calculator;

public class PracticeCal  {

  public static void main(String[] args) {
    // 987 + 333 - 299 * 7 / 5 =
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();


    c1.plus(987);
    c1.plus(333);
    c1.minus(299);
    c1.multiple(7);
    c1.divide(5);

    c2.plus(9);
    c2.plus(33);
    c2.minus(2);
    c2.multiple(7);
    c2.divide(5);

    Calculator.resultCal(c1.result);
    Calculator.resultCal(c2.result);
  }
}
