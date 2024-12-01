package com.systemDesign.solidPrinciple;

public class Invoice {
    //now this class will not impact on any other class
    Marker marker;
    int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker= marker;
        this.quantity=quantity;
    }
    public int calculatePrice(){
        int price = ((marker.price) * this.quantity);
        return price;
    }
}
