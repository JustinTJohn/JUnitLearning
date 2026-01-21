package org.example;

public class OrderService {
    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public boolean placeOrder(int amount){
        return paymentGateway.makePayment(amount);
    }
}
