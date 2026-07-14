package com.lryg.s20260714;

public class Student extends People {

    public Student() {
    }

    public Student(String name, int account, int passwd) {
        super(name, account, passwd);
    }

    @Override
    public void work(){
        System.out.println("学生的工作是学习");
    }
}
