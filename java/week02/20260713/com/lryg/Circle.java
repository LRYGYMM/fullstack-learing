package com.lryg;

public class Circle {
    private double radius;
    private final double pi = 3.14;

    public double getArea() {
        return pi * radius * radius;
    }
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
