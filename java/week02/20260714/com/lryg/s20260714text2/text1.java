package com.lryg.s20260714text2;

public class text1 {
    public static void main(String[] args) {
        Swim1 swim1 = new Swim1() {
            @Override
            public void swim() {
                System.out.println("swimming");
            }
        };
        goSwim(swim1);

    }

    public static void goSwim(Swim1 swim1) {
        swim1.swim();
    }


    }


