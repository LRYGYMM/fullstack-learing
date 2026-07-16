package com.lryg.bean;

public class User {
    private String id;
    private String username;
    private String password;
    private Boolean status;

    public User() {
        id = creatId();
        status = true;
    }

    public User(String username, String password) {
        id = creatId();
        this.username = username;
        this.password = password;
        status = true;


    }

    //id用户无法设置，是自动生成的，格式为:Fight+5位数字的随机数
    public String creatId() {
        StringBuilder a = new StringBuilder("Fight");
        a.append((int) (Math.random() * 100000));
        return a.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
