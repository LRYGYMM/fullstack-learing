package com.lryg.text;

public class Device {
    // 修正单词 brand 品牌
    private String brand;
    private double price;

    // JavaBean强制：无参构造
    public Device() {
    }

    // 全参构造（推荐新增）
    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}