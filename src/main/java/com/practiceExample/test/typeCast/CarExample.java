package com.test.typeCast;

public class CarExample {
  public static void main(String[] args) {
    Car car = new Car(); // Car 객체 생성 
    
    for (int i = 1; i <= 5; i++) {
      int problemLocation = car.run(); //Car 객체의 run()메소드를 반복실행한다.
      
      switch(problemLocation) {
        case 1 : // 앞왼쪽 타이어가 펑크났을 때 HanKookTire로 교체
          System.out.println("frontleft HanKookTire replace");
          car.frontLeftTire = new HanKookTire("frontLeft", 15);
          break;
          
        case 2 : // 앞오른쪽 타이어가 펑크났을 때 KumhoTire로 교체 
          System.out.println("frontRight KumhoTire replace");
          car.frontRightTire = new KumhoTire("frontRight", 13);
          break;
          
        case 3 : // 뒤왼쪽 타이어가 펑크났을 때 HankookTire로 교체 
          System.out.println("backleft HanKookTire replace");
          car.backLeftTire= new HanKookTire("backLeft", 14);
          break;
        case 4 : // 뒤오른쪽 타이어가 펑크났을 때 KumhoTire로 교체 
          System.out.println("backRight KumhoTire replace");
          car.backRightTire= new KumhoTire("backRight", 18);
          break;
      }
      // 1회전시 출력되는 내용을 구분한다. 
      System.out.println("-----------------------------"); 
    }
  }
}
