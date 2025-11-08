package com.stemlink.app;

public class DebitCardPayment extends CardPayment implements Discount{
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

    @Override
    public double applyDiscount(double percent) {
        double discount = getAmount() * percent/100;
        setAmount(getAmount()-discount);
        return discount;
    }

    @Override
    public double finalAmount() {
        return getAmount();
    }

    @Override
    public boolean validate() {
        if(availableBalance<getAmount()){
            return false;
        }
        return super.validate();
    }
}
