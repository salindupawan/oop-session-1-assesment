package com.stemlink.app;

public class BankTransfer extends Payment{
    private String bankName;
    private String accountNumber;
    private String referenceCode;

    public BankTransfer(Double amount, String currency, String status) {
        super(amount, currency, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Initiating bank transfer to "+this.bankName+" using account "+this.accountNumber+" with reference "+this.referenceCode);
        this.markAsCompleted();
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    @Override
    public boolean validate() {
        if(bankName == null || accountNumber == null || referenceCode == null) {
            return false;
        }
        if (bankName.isEmpty() || accountNumber.isEmpty() || referenceCode.isEmpty()) {
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
