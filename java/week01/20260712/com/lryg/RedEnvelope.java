package com.lryg;

import java.util.Random;

public class RedEnvelope {
    public static void main(String[] args) {
        /*  给你两个整数和N，N表示红包的总额，表示红包的个数现在又个人来抽红包，每个人都是随机的，打印每个人领的红包金额
            要求1每个人最少1分钱
            要求3，最后一个人是拿剩余的总额
            要求2每个人领完红包之后，至少预留1N分钱*/
        int money = 4;
        int num = 5;
        Random r = new Random();
        if(money < num){
            System.out.println("红包金额不够，下次再试");
        }
        else{
            for (int i = 1; i <=num -1; i++){
                int MyMoney = r.nextInt(money-(num-i)) + 1;
                //1 2 3 4 这里是第几个人
                //4 3 2 1 这里是最少要预留的金额
                System.out.println("第" + i  + "个人拿了" + MyMoney + "分");
                //总额减去已经领取的金额
                money-=MyMoney;
            }
            System.out.println("最后一个人拿了" + money  + "分");
        }
    }

}
