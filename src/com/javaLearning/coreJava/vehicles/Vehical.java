package com.javaLearning.coreJava.vehicles;

abstract class Vehical {
    private int speed;
    private String fuelType;

    public Vehical(String fuelType, int speed) {

        this.fuelType = fuelType;
        this.speed = speed;
    }

    public int getSpeed() {
       return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) { // Example of controlled access
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    abstract void startEngine();


    public void move(){

    };

}

