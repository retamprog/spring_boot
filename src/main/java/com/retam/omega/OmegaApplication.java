package com.retam.omega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OmegaApplication {
// well this is the main application
	public static void main(String[] args) {
		// SpringApplication.run(OmegaApplication.class, args);
        var OrderService=new OrderService(new PayPalPaymentService());
		OrderService.placeOrder(10);
	}

}
