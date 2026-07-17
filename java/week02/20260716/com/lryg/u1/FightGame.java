package com.lryg.u1;

import com.lryg.bean.Herocharacter;
import com.lryg.bean.enemy;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FightGame {
    public void gameStart(String username) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println(" 🎮" + username + " 欢迎来到文字格斗游戏 🎮");
        System.out.println("╚═════════════════════════════╝");
        System.out.println("请选择操作：1登录 2注册 3忘记密码");
        Herocharacter player = createPlayerCharacter(username);
        System.out.println("角色创建成功！");
        System.out.println("🌟  初始属性:" + player.show());
        System.out.println("🌟  初始技能:" + player.showSkill());
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
        enemies.add(new enemy("神秘法师", 70, 25, 8, "火球术"));

        int count = 1;//记录当前我和和第几个敌人在战斗
        int wins = 0;//记录胜利的敌人数量
        while (player.isAlive()) {
            //重置敌人的状态
            if (wins != 0) {
                for (int i = 0; i < enemies.size(); i++) {
                    enemy c = enemies.get(i);
                    c.maxHP = c.maxHP + 10;
                    c.HP = c.maxHP;
                    c.attack = c.attack + 2;
                    c.defense = c.defense + 3;
                    c.defending = false;//重置敌人是否防御状态
                }
            }
            Random r = new Random();
            int index = r.nextInt(enemies.size());
            enemy en = enemies.get(index);
            System.out.println(en.show());
            System.out.println("═══════════════════════════════════════");
            System.out.println("⚔️ 第" + count + " 场战斗开始！对手: " + en.name);

            int round = 1;
            while (player.isAlive()) {
                System.out.println("═══════════════════════════════════════");
                System.out.println("⚔️ 第" + count + " 回合开始！");
                //打印血条
                System.out.println(getBloodBar(player.name, player.HP, player.maxHP));
                System.out.println(getBloodBar(en.name, en.HP, en.maxHP));

                //玩家回合：
                playerTurn(player, en);
                //判断敌人是否死亡
                if (!en.isAlive()) {
                    //🎉 你击败了 敏捷刺客！
                    System.out.println("🎉 你击败了 " + en.name + "！");
                    wins++;
                    break;
                }

                //敌人回合：
                enemyTurn(en, player);
                if (!player.isAlive()) {
                    //💀 你被 敏捷刺客 击败了！
                    System.out.println("💀 你被 " + en.name + " 击败了！");
                    break;
                }
                //回合结束，回合数加一
                round++;


            }
            if (player.isAlive()){
                //玩家回血
                int reward = r.nextInt(21)+20 ;
                player.heal(reward);
                System.out.println("💚 战斗结束！你恢复了 " + reward + " 点生命值");
                System.out.println("🏆 当前胜场: " + wins);
                System.out.println("═══════════════════════════════════════");
            }
            //成长系统
            if(player.isAlive()&&wins>0&&wins%3==0) {
                System.out.println("🌟 恭喜你，获得了属性提升！🎉");
                player.maxHP += 30;
                player.attack += 5;
                player.defense += 3;
                System.out.println("最大生命值提升30，攻击力提升5，防御力提升3！🎊");
                System.out.println("当前属性: " + player.show());
            }
            if (player.isAlive() ){
                System.out.println("是否还要继续战斗？(y/n)");
                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                } else if (choice.equalsIgnoreCase("y")) {
                    System.out.println("继续战斗！");
                    count++;
                    continue;
                } else {
                    System.out.println("输入错误，请重新输入！默认继续战斗！");
                    count++;
                    continue;
                }
            }


        }

        //游戏结算
        System.out.println("═══════════════════════════════════════");
        System.out.println("游戏结束！");
        System.out.println("🏆 最终胜场: " + wins);
        System.out.println("感谢游玩文字格斗游戏！");
        //停止运行
        System.exit(0);

    }

    //敌人的回合
    private void enemyTurn(enemy en, Herocharacter player) {
        System.out.println("===== “" + en.name + "的回合 =====");
        String action = "普通攻击";
        Random random = new Random();
        int num = random.nextInt(10);
        if (num >= 5) {
            action = en.skill;
        }
        switch (action) {
            case "普通攻击":
                int damage1 = calculateDamage(en.attack, player.defense);
                System.out.println("⚔️ " + en.name + " 对 " + player.name + " 使用了普通攻击，造成 " + damage1 + " 点伤害！");
                player.takeDamage(damage1);
                break;
            case "猛击":
                int damage2 = calculateDamage((int) (en.attack * 1.5), player.defense);
                System.out.println("⚔️ " + en.name + " 对 " + player.name + " 使用了猛击，造成 " + damage2 + " 点伤害！");
                player.takeDamage(damage2);
                break;
            case "快速攻击":
                int damage0 = 0;
                for (int i = 0; i < 2; i++) {
                    int damage3 = calculateDamage(en.attack / 2, player.defense);
                    damage0 += damage3;
                }
                System.out.println("⚔️ " + en.name + " 对 " + player.name + " 使用了快速攻击，造成 " + damage0 + " 点伤害！");
                player.takeDamage(damage0);
                break;
            case "防御姿态":
                en.defending = true;
                System.out.println("🛡️ " + en.name + " 进入防御姿态，下一次攻击将减半！");
                break;
            case "火球术":
                int damage5 = calculateDamage((int) (en.attack * 1.8), player.defense);
                System.out.println("🔥" + en.name + " 对 " + player.name + " 使用了火球术，造成 " + damage5 + " 点伤害！");
                player.takeDamage(damage5);

                break;
        }


    }

    //定义一个方法打印敌我双方的血条
    /*zhangsan: [████████████████████] 100/100 HP
    初级战士: [████████████████████] 80/80 HP*/
    public String getBloodBar(String name, int HP, int maxHP) {
        int barLength = 20;
        int filledLength = (int) (HP * 1.0 * barLength / maxHP);
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        for (int i = 0; i < barLength; i++) {
            if (i < filledLength) {
                sb.append("█");
            } else {
                sb.append(" ");
            }
        }
        sb.append("] ").append(HP).append("/").append(maxHP).append(" HP");
        return sb.toString();
    }

    // 创建玩家角色
    public Herocharacter createPlayerCharacter(String username) {
        System.out.println("创建您的角色");
        System.out.println("您的角色名为：" + username);
        int point = 20;
        System.out.println("请分配属性点 (共20点):");
        System.out.println("1. 生命值 (每点+10 HP)");
        System.out.println("2. 攻击力 (每点+2 ATK)");
        System.out.println("3. 防御力 (每点+1 DEF)");
        Scanner sc = new Scanner(System.in);
        //定义数组存储要提示的属性
        String[] attributes = {"生命值", "攻击力", "防御力"};
        //定义数组记录三个属性的分配的点数
        int[] points = new int[3];
        for (int i = 0; i < points.length; i++) {
            System.out.println("点数分配到" + attributes[i] + "(剩余点数：" + point + "）：");
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("无效输入！默认分配0点");
                input = 0;
            }
            if (input > point) {
                System.out.println("无效输入！默认分配剩下所有点数");
                input = point;
            }
            points[i] = input;
            point -= input;
        }
        //创建玩家角色对象
        Herocharacter player = new Herocharacter(
                username,
                100 + points[0] * 10,
                10 + points[1] * 2,
                points[2],
                null
        );
        player.skills.add("普通攻击");
        player.skills.add("强力一击");
        player.skills.add("生命汲取");
        return player;
    }

    //玩家回合
    public void playerTurn(Herocharacter player, enemy en) {
        System.out.println("===== 你的回合 =====");
        System.out.println("1. 普通攻击");
        System.out.println("2. 强力一击 (消耗10HP)");
        System.out.println("3. 生命汲取 (消耗10HP，恢复生命)");
        System.out.println("选择行动 (1-3):");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        switch (choice) {
            default:
                System.out.println("无效输入！默认选择普通攻击。");
            case "1":
                System.out.println("你使用了普通攻击！");
                int damage = calculateDamage(player.attack, en.defense);
                System.out.println("⚔️ 你对 " + en.name + " 使用了普通攻击，造成 " + damage + " 点伤害！");
                en.takeDamage(damage);
                break;
            case "2":
                if (player.HP >= 10) {
                    System.out.println("你使用了强力一击！");
                    player.takeDamage(10);
                    int damage1 = calculateDamage((int) (player.attack * 1.5), en.defense);
                    System.out.println("💥 消耗10HP，你对 " + en.name + " 使用了强力一击，造成 " + damage1 + " 点伤害！");
                    en.takeDamage(damage1);
                } else {
                    System.out.println("你的HP不足10，无法使用强力一击！");
                }
                break;
            case "3":
                Random random = new Random();
                if (player.HP >= 10) {
                    System.out.println("你使用了生命汲取！");
                    player.takeDamage(10);
                    int damage2 = calculateDamage((int) (player.attack * 1.5), en.defense);
                    System.out.println("💥 消耗10HP，你对 " + en.name + " 使用了生命汲取，造成 " + damage2 + " 点伤害！");
                    en.takeDamage(damage2);
                    int healhp = random.nextInt(21);
                    player.heal(healhp);
                    System.out.println("💚 你恢复了 " + healhp + " 点生命！");
                } else {
                    System.out.println("你的HP不足10，无法使用生命汲取！");
                }
                break;


        }

    }

    public int calculateDamage(int attack, int defense) {
        int damage = attack - defense;
        if (damage < 1) {
            damage = 1;
        }
        return damage;
    }

}
//用来计算伤害
//普通攻击的调用方式：calculateDamage(player.attack, en.defense)
//技能的调用方式：calculateDamage(player.attack * 百分比, en.defense)




