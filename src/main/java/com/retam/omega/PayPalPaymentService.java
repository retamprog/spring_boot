package com.retam.omega;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amt){
        System.out.println("PAYPAL");
        System.out.println("Amount: "+"$"+amt);
    }
}
