package com.stemlink.app;

public class DebitCardPayment extends CardPayment{
    private Double availableBalance;

    public DebitCardPayment(Double amount, String currency, String status) {
        super(amount, currency, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance "+this.availableBalance+" for amount "+this.getAmount());
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
