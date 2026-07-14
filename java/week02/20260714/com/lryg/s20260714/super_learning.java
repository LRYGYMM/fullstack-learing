package com.lryg.s20260714;

public class super_learning {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 1888888888, 123456);

        AdminSystem adminSystem = new AdminSystem();
        adminSystem.register(s1);
        People p = new Student();
        p.work();

    }
}
