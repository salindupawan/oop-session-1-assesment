package com.stemlink.app;

public class Payment {
    public static final String LKR = "LKR";
    public static final String USD = "USD";
    public static final String PENDING = "PENDING";
    public static final String COMPLETED = "COMPLETED";
    public static final String CANCELED = "CANCELED";

    private Double amount;
    private String currency;
    private String status;

    public Payment(Double amount, String currency, String status) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public void processPayment() {
        System.out.println("Processing generic payment...");
    }

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
}
