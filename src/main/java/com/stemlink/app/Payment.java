package com.stemlink.app;

import java.util.UUID;

public abstract class Payment implements Payable {
    public static final String LKR = "LKR";
    public static final String USD = "USD";
    public static final String PENDING = "PENDING";
    public static final String COMPLETED = "COMPLETED";
    public static final String CANCELED = "CANCELED";

    private Double amount;
    private String currency;
    private String status;
    private String referenceId;

    public Payment(Double amount, String currency, String status) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public abstract void processPayment();

    public void generateReceipt(){
        System.out.println("Receipt for amount "+this.amount+", currency "+this.currency);
    }

    public void markAsCompleted(){
        this.status = COMPLETED;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getReference() {
        if(referenceId == null){
            referenceId = UUID.randomUUID().toString();
        }
        return referenceId;
    }


}
