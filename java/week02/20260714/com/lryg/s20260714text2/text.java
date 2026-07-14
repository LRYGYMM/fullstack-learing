package com.lryg.s20260714text2;

public class text {
    public static void main(String[] args) {
        Frog frog = new Frog("癞蛤蟆", "绿色");
        frog.eat();
        frog.swim();
        System.out.println(frog.getName() + "是" + frog.getColor());

        Dog dog = new Dog("哈士奇", "白色");
        dog.eat();
        dog.swim();
        System.out.println(dog.getName() + "是" + dog.getColor());
        Rabbit rabbit = new Rabbit("兔子", "棕色");
        System.out.println(rabbit.getName() + "是" + rabbit.getColor());
        rabbit.eat();
    }
}
