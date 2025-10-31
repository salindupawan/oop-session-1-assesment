package com.stemlink.app;

public class CashOnDelivery extends Payment{
    private String deliveryAddress;

    public CashOnDelivery(Double amount, String currency, String status) {
        super(amount, currency, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Cash will be collected at delivery address: "+this.deliveryAddress);
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
