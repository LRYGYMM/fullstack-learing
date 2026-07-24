package com.lryg.s20260724;

public class lambadatxt1 {
    public static void main(String[] args) {
        //labmda表达是的注意特点
        // 1. 函数式接口
        // 函数式接口：只有一个抽象方法的接口 接口上方加 @FunctionalInterface
        // 2. 无参数，无返回值
        // 3. 代码一行

        //匿名类的实现方式
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println(" swimming ");
            }
        });
        // Lambda expression
        method(() -> {
            System.out.println(" swimming ");
        });

    }
    public static void method(Swim s) {
        s.swimming();
    }
    @FunctionalInterface
    interface Swim {
        public abstract void swimming();
    }
}
