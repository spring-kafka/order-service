package org.example.orderservice.service;

import org.example.orderservice.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  public Order placeOrder(Order order) {
    order.setOrderId(generateOrderId());

    return order;
  }

  private String generateOrderId() {
    return "ORD-" + System.currentTimeMillis();
  }
}
