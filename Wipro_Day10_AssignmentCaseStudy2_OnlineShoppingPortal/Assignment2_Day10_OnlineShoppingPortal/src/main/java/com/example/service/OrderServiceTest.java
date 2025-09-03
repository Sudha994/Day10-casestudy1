package com.example.service;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.example.config.AppConfig;
import com.example.exception.OrderNotFoundException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testOrderWorkflow() throws OrderNotFoundException {
        // Successful scenario
        orderService.addToCart("Laptop");
        String orderId = "ORD123";
        orderService.placeOrder(orderId);
        orderService.cancelOrder(orderId);
        
        // Exception scenario
        try {
            orderService.placeOrder("INVALID_ID");
        } catch (OrderNotFoundException e) {
            System.out.println("Expected exception: " + e.getMessage());
        }
    }
}