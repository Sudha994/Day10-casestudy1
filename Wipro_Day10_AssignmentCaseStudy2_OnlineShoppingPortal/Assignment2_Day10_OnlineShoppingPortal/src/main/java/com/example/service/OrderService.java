package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.exception.OrderNotFoundException;
import com.example.model.Order;

@Service
public class OrderService {

	private final Map<String, Order> orders = new HashMap<>();

    public void addToCart(String product) {
        String orderId = "ORD" + System.currentTimeMillis();
        orders.put(orderId, new Order(orderId, product, orderId));
        System.out.println("Added to cart: " + product);
    }

    public void placeOrder(String orderId) throws OrderNotFoundException {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new OrderNotFoundException("Order not found: " + orderId);
        }
        order.setStatus("PLACED");
        System.out.println("Order placed: " + orderId);
    }

    public void cancelOrder(String orderId) throws OrderNotFoundException {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new OrderNotFoundException("Order not found: " + orderId);
        }
        order.setStatus("CANCELLED");
        System.out.println("Order cancelled: " + orderId);
    }
}
