package com.systemDesign.solidPrinciple;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
      this.invoice = invoice;
    }
    public void saveToDb(){
        //save to db
    }
}
