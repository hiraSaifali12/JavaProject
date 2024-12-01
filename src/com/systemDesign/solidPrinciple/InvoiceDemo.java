package com.systemDesign.solidPrinciple;

public class InvoiceDemo {
    Marker marker;
    int quantity;
    public InvoiceDemo(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price)* this.quantity);
        return price;
    }
    public void printInvoice(){
        //print the invoice
    }
    public void saveToDb(){
        //save to db
    }
    /*
    * in calculator method , if soe additional changes happened let say some gst kind of concept came so we have to do some changaes in it
    * in print method we have to do changes in printing logic
    * in save to db, if i want to add this into filesystem so, class will change
    * so here we have alot reason for changing the class
    * for correcting this make all class differntly
    */

}
