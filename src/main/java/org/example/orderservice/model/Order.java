package org.example.orderservice.model;

import java.math.BigDecimal;

public class Order {
  private String orderId;
  private int quantity;
  private BigDecimal price;
  private String productName;

  public Order(int quantity, BigDecimal price, String productName) {
    this.quantity = quantity;
    this.price = price;
    this.productName = productName;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId='" + orderId + '\'' +
            ", quantity=" + quantity +
            ", price=" + price +
            ", productName=" + productName +
            '}';
  }
}
