package com.lryg.s20260714text;

public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(String brand, double speed) {
        super(brand, speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand()+"的自行车，正在以"+getSpeed()+"的速度移动");
    }
    public void ringBell(){
        System.out.println(getBrand()+"正在响铃：叮当当");
    }
}
