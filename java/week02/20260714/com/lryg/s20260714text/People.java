package com.lryg.s20260714text;

public class People {
    private String name;
    private int age;
    private String sex;

    public People() {
    }

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void Ride(Vehicle vehicle){
        if(vehicle instanceof Bike){
            Bike b =(Bike) vehicle;
            System.out.println(getName()+"正在骑"+b.getBrand()+"正在以"+b.getSpeed()+"的速度移动");
        } else if (vehicle instanceof Car) {
            Car c =(Car) vehicle;
            System.out.println(getName()+"正在开"+c.getBrand()+"正在以"+c.getSpeed()+"的速度移动");
        }
    }
}
