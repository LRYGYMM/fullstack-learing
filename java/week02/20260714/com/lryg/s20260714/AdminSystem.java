package com.lryg.s20260714;

public class AdminSystem {
    public void register(People people){
        System.out.println("姓名为"+people.getName()+"的用户注册成功，账号是"+people.getAccount()+",密码是"+people.getPasswd());
    }
}
