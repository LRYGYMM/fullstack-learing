package com.lryg.s20260714text;

public class text {
    public static void main(String[] args) {
        People p1 = new People("张三", 18, "男");
        Car c1 = new Car("宝马", 120);
        p1.Ride(c1);
        c1.honk();
        Bike b1 = new Bike("永久", 15);
        p1.Ride(b1);
        b1.ringBell();
    }
}
