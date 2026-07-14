package com.lryg.s20260714;

public class People {
    private String name ;
    private int account;
    private int passwd;
    public People() {
    }

    public People(String name, int account, int passwd) {
        this.name = name;
        this.account = account;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPasswd() {
        return passwd;
    }

    public void setPasswd(int passwd) {
        this.passwd = passwd;
    }
    public void work() {
        System.out.println("每个人都需要工作");
    }
}


