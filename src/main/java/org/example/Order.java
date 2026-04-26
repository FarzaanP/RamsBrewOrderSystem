package org.example;

public class Order {
    private final Beverage beverage;
    private final String orderType;
    private static int counter = 1;
    private final int orderId;

    public Order(Beverage beverage, String orderType) {
        this.beverage = beverage;
        this.orderType = orderType;
        this.orderId = counter++;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " [" + orderType + "]: " + beverage;
    }
}
