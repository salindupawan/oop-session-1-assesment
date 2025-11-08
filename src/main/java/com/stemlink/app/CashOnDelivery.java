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

    @Override
    public boolean validate() {
        if(deliveryAddress == null || deliveryAddress.isEmpty()){
            return false;
        }
        if(getAmount() == null || getCurrency() == null || getStatus() == null){
            return false;
        }
        if(getAmount()<=0 || getCurrency().isEmpty() || getStatus().isEmpty()){
            return false;
        }
        return true;
    }
}
