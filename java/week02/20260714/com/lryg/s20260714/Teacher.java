package com.lryg.s20260714;

public class Teacher extends People {
    public Teacher() {
    }

    public Teacher(String name, int account, int passwd) {
        super(name, account, passwd);
    }

    @Override
    public void work(){
        System.out.println("老师的工作是教书");
    }
}
