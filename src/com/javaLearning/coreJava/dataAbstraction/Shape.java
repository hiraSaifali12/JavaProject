package com.javaLearning.coreJava.dataAbstraction;

abstract class Shape {
    String color;
    abstract double area();
   public abstract String toString();
  public Shape(String color ){
      System.out.println("shape constructer calling");
      this.color=color;
    }
    public String getColor(){ return color; }
}