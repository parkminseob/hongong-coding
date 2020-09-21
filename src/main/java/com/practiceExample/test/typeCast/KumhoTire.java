package com.test.typeCast;

public class KumhoTire extends Tire{
  
  public KumhoTire(String location, int maxRotation) {
    super (location, maxRotation);
  }
  @Override
  public boolean roll() {
    ++accumulatedRotation;
    if(accumulatedRotation < maxRotation) {
      System.out.println(location + " KumhoTire life : " +
    (maxRotation - accumulatedRotation) + "time");
    return true;
    } else {
      System.out.println("*** " + location + "KumhoTire punk ***");
     return false;
    }
  }
}
