package com.javaLearning.coreJava.vehicles;

public class Car extends Vehical {
    public Car(String fuelType, int speed){
       super(fuelType,speed);
    };

    @Override
    void startEngine() {
        System.out.println("car is running");
    }

    @Override
    public void move(){
        System.out.println("car is moving");
    }

}
