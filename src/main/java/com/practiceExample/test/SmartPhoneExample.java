package com.practiceExample.test;

public class SmartPhoneExample {
  public static void main(String[] args) {
    SmartPhone mySmartPhone = new SmartPhone("Google", "Android");
    
    String strObj = mySmartPhone.toString(); // 재정의된 toString()호출 
    
    System.out.println(strObj);
    System.out.println(mySmartPhone); // 재정의된 toString()을 호출하고 리턴값을 출력
  }
}
