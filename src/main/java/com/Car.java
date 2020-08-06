package com;

public class Car {
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;


  Car() {
    //생성자
  }

  Car(String model){
    this(model, "aaa", 250);
  }
  Car(String model, String color){
    this(model, color, 250);
  }
  Car(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;

  }
}
