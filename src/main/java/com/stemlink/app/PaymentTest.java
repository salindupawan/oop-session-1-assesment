package com.stemlink.app;

import java.util.ArrayList;
import java.util.List;

public class PaymentTest {
    public static void main(String[] args) {
        //store all the payments
        List<Payment> payments = new ArrayList<Payment>();

        //cash on delivery
        CashOnDelivery cashOnDelivery = new CashOnDelivery(1000.0, Payment.LKR, Payment.PENDING);
        cashOnDelivery.setDeliveryAddress("Maligawaththa rd, Colombo");
        payments.add(cashOnDelivery);

        //bank transfer
        BankTransfer bankTransfer = new BankTransfer(2000.0, Payment.LKR, Payment.PENDING);
        bankTransfer.setBankName("Bank of Ceylon");
        bankTransfer.setAccountNumber("123456789");
        bankTransfer.setReferenceCode("32323232322");
        payments.add(bankTransfer);

        //credit card payment
        CreditCardPayment creditCardPayment = new CreditCardPayment(3000.0, Payment.LKR, Payment.PENDING);
        creditCardPayment.setCardNumber("123456789");
        creditCardPayment.setCardHolderName("salindu");
        creditCardPayment.setExpiryDate("12/27");
        creditCardPayment.setCreditLimit(50000.0);
        payments.add(creditCardPayment);

        //debit card payment
        DebitCardPayment debitCardPayment = new DebitCardPayment(4000.0, Payment.USD, Payment.PENDING);
        debitCardPayment.setCardNumber("123456789");
        debitCardPayment.setCardHolderName("salindu");
        debitCardPayment.setExpiryDate("12/27");
        debitCardPayment.setAvailableBalance(34000.0);
        payments.add(debitCardPayment);

        //loop all the payments and proceed payments
        for(Payment payment : payments) {
            payment.processPayment();
            payment.generateReceipt();

            System.out.println("----------------------------------------");
        }


    }
}
