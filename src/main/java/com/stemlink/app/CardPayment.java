package com.stemlink.app;

public class CardPayment extends Payment{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CardPayment(Double amount, String currency, String status) {
        super(amount, currency, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Authorizing card payment for "+this.cardHolderName);
    }

    public void validateCard(){
        System.out.println("Validating card number format...");
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean validate() {
        if(cardNumber == null || cardHolderName == null || expiryDate == null){
            return false;
        }
        if(cardNumber.isEmpty() || cardHolderName.isEmpty() || expiryDate.isEmpty()){
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
