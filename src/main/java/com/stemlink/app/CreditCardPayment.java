package com.stemlink.app;

public class CreditCardPayment extends CardPayment{
    private Double creditLimit;

    public CreditCardPayment(Double amount, String currency, String status) {
        super(amount, currency, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Charging credit card with limit "+this.creditLimit+" for amount "+this.getAmount());
    }

    public void applyInterest(){
        System.out.println("Applying interest if payment is not settled by due date");
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
