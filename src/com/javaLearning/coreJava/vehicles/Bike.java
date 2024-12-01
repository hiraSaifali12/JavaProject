package com.javaLearning.coreJava.vehicles;

 public class Bike extends Vehical{

     public Bike(String fuelType, int speed){
        super(fuelType,speed);
     };

     @Override
  void startEngine() {
         System.out.println("bike is running");
     }

     @Override
     public void move() {
         System.out.println("Bike is moving on two wheels.");
     }

     }
