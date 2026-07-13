package com.lryg;

public enum OrderState {
    PAYMENT_PENDING( "待支付"),
    PROCESSING(  "处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");
    private String state;

    OrderState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
