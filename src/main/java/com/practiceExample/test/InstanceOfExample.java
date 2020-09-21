package com.test;

public class InstanceOfExample {
  
  
  public static void method1(Parent2 parent2) {
    if(parent2 instanceof Child2) { 
      // 야 왼쪽이 오른쪽 상속받았냐고? 
      System.out.println("method1 - Child 타입 변환 성공!");
    } else {
      System.out.println("method1 - Child 타입 변환 실패!");
    }
  }  
  
  public static void method2(Parent2 parent2) {
    Child2 child2 = (Child2) parent2;
    // instanceof로 타입변환이 가능한지 확인을 해주지 않았기 때문에
    // classCastException이 발생할 가능성이 있다.
    
    System.out.println("method2- Child로 변환 성공!");
    
  }
  public static void main(String[] args) {
    Parent2 parentA = new Child2();
    // 사람객체를 동물에 담을순 있지.
    // 하지만 모든 동물이 사람 특징을 가지고 있는 것은 아니잖아요???
    
    
    method1(parentA);
    method2(parentA);

    Parent2 parentB = new Parent2();
    // Parent 객체를 매개값으로 전달한다.
    method1(parentB);  
    method2(parentB);  
    // 여기서 method2에서 classCastException이 발생하는 이유
    // instanceof연산자로 변환이 가능한지 확인하지 않아서.
    Child2 child3 = new Parent2();
    Parent2 parent3 = new Child2();
    
  }
}
