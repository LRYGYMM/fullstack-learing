package com.lryg.u1;

import com.lryg.bean.Herocharacter;
import com.lryg.bean.enemy;

import java.util.ArrayList;
import java.util.Scanner;

public class FightGame {
    public void gameStart(String username) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println(" 🎮" + username + " 欢迎来到文字格斗游戏 🎮");
        System.out.println("╚═════════════════════════════╝");
        System.out.println("请选择操作：1登录 2注册 3忘记密码");
        Herocharacter player=createPlayerCharacter(username);
        System.out.println("角色创建成功！");
        System.out.println("🌟  初始属性:"+player.show());
        System.out.println("🌟  初始技能:"+player.showSkill());
        //创建敌人角色
        /*name	hp	atk	def	skill
        初级战士	80	15	10	猛击
        敏捷刺客	60	20	5	快速攻击
        重装坦克	120	10	20	防御姿态
        神秘法师	70	25	8	火球术（180% 伤害）*/
        ArrayList<enemy> enemies = new ArrayList<>();
        enemies.add(new enemy("初级战士", 80, 15, 10, "猛击"));
        enemies.add(new enemy("敏捷刺客", 60, 20, 5, "快速攻击"));
        enemies.add(new enemy("重装坦克", 120, 10, 20, "防御姿态"));
        enemies.add(new enemy("神秘法师", 70, 25, 8, "火球术（180% 伤害）"));

    }

    // 创建玩家角色
    public Herocharacter createPlayerCharacter(String username) {
        System.out.println("创建您的角色");
        System.out.println("您的角色名为："+username);
        int point=20;
        System.out.println("请分配属性点 (共20点):");
        System.out.println("1. 生命值 (每点+10 HP)");
        System.out.println("2. 攻击力 (每点+2 ATK)");
        System.out.println("3. 防御力 (每点+1 DEF)");
        Scanner sc = new Scanner(System.in);
        //定义数组存储要提示的属性
        String[] attributes = {"生命值", "攻击力", "防御力"};
        //定义数组记录三个属性的分配的点数
        int[] points = new int[3];
        for (int i = 0; i < points.length; i++){
            System.out.println("点数分配到"+attributes[i]+"(剩余点数："+point+"）：");
            int input = sc.nextInt();
            if (input<0){
                System.out.println("无效输入！默认分配0点");
                input=0;
            }
            if (input>point){
                System.out.println("无效输入！默认分配剩下所有点数");
                input=point;
            }
            points[i]=input;
            point-=input;
        }
        //创建玩家角色对象
        Herocharacter player = new Herocharacter(
                username,
                100+points[0] * 10,
                10+points[1] * 2,
                points[2],
                null
        );
        player.skills.add("普通攻击");
        player.skills.add("强力一击");
        player.skills.add("生命汲取");
        return player;



    }
}
