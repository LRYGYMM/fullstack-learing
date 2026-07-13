package com.lryg;

public class Enum_learning {
    public static void main(String[] args) {
        OrderState o1 = OrderState.PAYMENT_PENDING;
        switch (o1){
            case PAYMENT_PENDING -> System.out.println("Payment is pending");
            case PROCESSING -> System.out.println("Order is being processed");
            case SHIPPED -> System.out.println("Order has been shipped");
            case OUT_FOR_DELIVERY -> System.out.println("Order is out for delivery");
            case DELIVERED -> System.out.println("Order has been delivered");
            case CANCELLED -> System.out.println("Order has been cancelled");
        }
    }
}
