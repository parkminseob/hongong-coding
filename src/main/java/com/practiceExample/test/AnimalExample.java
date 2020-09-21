package com.practiceExample.test;

public class AnimalExample {
  public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.Sound();
    cat.Sound();
    System.out.println("---");


    Animal animal;
    animal = new Dog();
    animal.Sound();

    animal = new Cat();
    animal.Sound();
    System.out.println("---");

    animalSound(new Dog());
    animalSound(new Cat());

  }
  public static void animalSound(Animal animal) {
    animal.Sound();
  }
}
