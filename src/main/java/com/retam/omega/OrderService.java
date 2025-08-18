package com.retam.omega;
// we are going to do dependency injection using constructor injection

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    //  var paymentservice = new 
    public void placeOrder(double order_cost){
        paymentService.processPayment(order_cost);
        System.out.println("the order has been placed...");
    }
}
