package org.example.orderservice.service;

import org.example.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final KafkaTemplate<String, Object> kafkaTemplate;

  @Autowired
  public OrderService(KafkaTemplate<String, Object> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public Order placeOrder(Order order) {
    order.setOrderId(generateOrderId());

    kafkaTemplate.send("notificationTopic", order.getOrderId());

    return order;
  }

  private String generateOrderId() {
    return "ORD-" + System.currentTimeMillis();
  }
}
