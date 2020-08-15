package com.test.typeCast;

public class HanKookTire extends Tire {
  
  public HanKookTire(String location, int maxRotation) {
    super(location, maxRotation);
  }
  @Override
  public boolean roll() {
    ++accumulatedRotation;
    if(accumulatedRotation < maxRotation) {
      System.out.println(location + "HanKookTire life : "+ 
    (maxRotation - accumulatedRotation) + "time");
     return true;
    } else {
      System.out.println("*** " + location + "HanKookTire punk ***");
     return false;
  }
  }
}
