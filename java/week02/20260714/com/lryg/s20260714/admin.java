package com.lryg.s20260714;

public class admin extends  People {
    public admin() {
    }

    public admin(String name, int account, int passwd) {
        super(name, account, passwd);
    }

    @Override
    public void work(){
        System.out.println("管理员的工作是管理网络");
    }
}
