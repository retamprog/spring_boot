package com.retam.omega;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amt){
         System.out.println("STRIPE");
         System.out.println("Amount: "+"$"+amt);
    }
}
