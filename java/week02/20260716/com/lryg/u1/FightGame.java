package com.lryg.u1;

import com.lryg.bean.Consumable;
import com.lryg.bean.Herocharacter;
import com.lryg.bean.enemy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FightGame {

    private static final Consumable[] CONSUMABLES = {
            new Consumable("桃子", 10),
            new Consumable("煎蛋", 20),
            new Consumable("花酿鸡", 30),
            new Consumable("黑背鲈鱼", 40),
            new Consumable("白玉汤", 50)
    };

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
                System.out.println("⚔️ 第" + round + " 回合开始！");
                //打印血条
                System.out.println(getBloodBar(player.name, player.HP, player.maxHP));
                System.out.println(getBloodBar(player.name, player.blueHP, player.MaxblueHP));
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
                    System.out.println("💀 你被 " + en.name + " 击败了！");
                    Random tauntRandom = new Random();
                    String taunt = TAUNTS[tauntRandom.nextInt(TAUNTS.length)];
                    System.out.println("😈 " + en.name + "：" + taunt);
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

                //胜利回复blueHP（0~30% MaxblueHP）
                int blueRecover = (int)(player.MaxblueHP * 0.3 * r.nextDouble());
                player.blueHP += blueRecover;
                if (player.blueHP > player.MaxblueHP) {
                    player.blueHP = 10;
                }
                System.out.println("💙 战斗结束！你恢复了 " + blueRecover + " 点MP");

                //道具掉落（30%几率）
                dropItem(player, r);

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
        int nameLength = name.length();
        if (HP > 10) {
            sb.append(name).append(": [");
            for (int i = 0; i < barLength; i++) {
                if (i < filledLength) {
                    sb.append("█");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("] ").append(HP).append("/").append(maxHP).append(" HP");
        }
        else
        {
            for (int i = 0; i <nameLength+2; i++){
            sb.append(" ");
            }
            sb.append("[");
            for (int i = 0; i < barLength; i++) {
                if (i < filledLength) {
                    sb.append("█");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("] ").append(HP).append("/").append(maxHP).append(" MP");
        }
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
                10,
                new ArrayList<String>()
        );
        player.skills.add("普通攻击");
        player.skills.add("强力一击");
        player.skills.add("生命汲取");
        return player;
    }

    //玩家回合
    public void playerTurn(Herocharacter player, enemy en) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===== 你的回合 =====");
            System.out.println("1. 普通攻击");
            System.out.println("2. 强力一击 (消耗2BP)");
            System.out.println("3. 生命汲取 (消耗3BP，恢复生命)");
            System.out.println("4. 使用道具");
            System.out.println("选择行动 (1-4):");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("你使用了普通攻击！");
                    int damage = calculateDamage(player.attack, en.defense);
                    System.out.println("⚔️ 你对 " + en.name + " 使用了普通攻击，造成 " + damage + " 点伤害！");
                    en.takeDamage(damage);
                    return;
                case "2":
                    if (player.blueHP >= 2) {
                        System.out.println("你使用了强力一击！");
                        player.Mp(2);
                        int damage1 = calculateDamage((int) (player.attack * 1.5), en.defense);
                        System.out.println("💥 消耗2MP，你对 " + en.name + " 使用了强力一击，造成 " + damage1 + " 点伤害！");
                        en.takeDamage(damage1);
                        return;
                    } else {
                        System.out.println("你的MP不足2，无法使用强力一击！");
                        continue;
                    }


                case "3":
                    Random random = new Random();
                    if (player.blueHP >= 3) {
                        System.out.println("你使用了生命汲取！");
                        player.Mp(3);
                        int damage2 = calculateDamage((int) (player.attack * 1.5), en.defense);
                        System.out.println("💥 消耗3MP，你对 " + en.name + " 使用了生命汲取，造成 " + damage2 + " 点伤害！");
                        en.takeDamage(damage2);
                        int healhp = random.nextInt(21);
                        player.heal(healhp);
                        System.out.println("💚 你恢复了 " + healhp + " 点生命！");
                        return;
                    } else {
                        System.out.println("你的MP不足3，无法使用生命汲取！");
                        continue;
                    }

                case "4":
                    if (player.packageList.isEmpty()) {
                        System.out.println("🎒 背包里没有道具！");
                        continue;
                    }
                    player.showPackage();
                    System.out.println("请选择要使用的道具编号（0取消）：");
                    int itemChoice = sc.nextInt();
                    if (itemChoice == 0) {
                        continue;
                    }
                    if (player.useConsumable(itemChoice - 1)) {
                        return;
                    } else {
                        System.out.println("无效的道具编号！");
                        continue;
                    }

            }
        }

    }

    private void dropItem(Herocharacter player, Random r) {
        if (r.nextInt(100) < 30) {
            Consumable item = CONSUMABLES[r.nextInt(CONSUMABLES.length)];
            player.packageList.add(new Consumable(item.getName(), item.getNum()));
            System.out.println("🎁 你获得了道具：" + item.getName() + "（生命+" + item.getNum() + "）");
        }
    }

    public int calculateDamage(int attack, int defense) {
        int damage = attack - defense;
        if (damage < 1) {
            damage = 1;
        }
        return damage;
    }
    private static final String[] TAUNTS = {
            "就这？我还以为你有多厉害呢！",
            "回去再练练吧，弱者！",
            "你连给我挠痒痒都不够格！",
            "哈哈哈，太弱了！我还没出力你就倒下了！",
            "下次带点实力再来吧，别浪费我的时间！",
            "你这点本事也敢来挑战我？",
            "我站在这里让你打，你都打不动！",
            "滚回去喝奶吧，小屁孩！",
            "我一只脚都能赢你，信不信？",
            "就你这攻击力，给我搓澡呢？",
            "认命吧，你永远不可能赢我！",
            "你妈没告诉你别出来丢人吗？",
            "我还没热身，你就输了！",
            "你是在给我加经验值吗？谢谢啊！",
            "废物就是废物，换个名字还是一样的！",
            "我建议你去打史莱姆，别来送死了！",
            "你这水平，我奶奶都能打赢你！",
            "别灰心，至少你勇气可嘉……才怪！",
            "你输的样子真狼狈！",
            "这就是你的全力？可笑！"
    };


}
//用来计算伤害
//普通攻击的调用方式：calculateDamage(player.attack, en.defense)
//技能的调用方式：calculateDamage(player.attack * 百分比, en.defense)




