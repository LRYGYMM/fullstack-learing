package com.lryg.apilearing;

import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        String rightname = "张三";
        String ringtpaaswd = "123456";
        Scanner sc =new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            boolean flag = name.equals(rightname) && password.equals(ringtpaaswd);
            if(flag){
                System.out.println("登录成功！");
                break;
            }
            else if(3-i>0){
                System.out.println("用户名或密码错误，请重新输入！还剩下"+(3-i)+"次机会");
            }
            else if(3-i==0){
                System.out.println(name+"被锁定,联系工作人员");
            }
        }
    }
}
