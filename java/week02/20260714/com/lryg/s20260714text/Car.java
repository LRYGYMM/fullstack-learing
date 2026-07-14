package com.lryg.s20260714text;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand()+"的汽车，正在以"+getSpeed()+"的速度移动");
    }
    public void honk(){
        System.out.println(getBrand()+"的汽车，正在鸣笛：叭叭");
    }
}
