package com.javaLearning.coreJava.vehicles;

public class Start {
    public static void main(String[] args) {
    Vehical car = new Car("diesel",40);
    car.startEngine();
    car.move();
    Vehical bike = new Bike("petrol",0);
    bike.startEngine();
    bike.move();
    }
}
