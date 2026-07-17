package com.lryg.bean;

public class Character {
    public String name;//角色名
    public int HP;//当前血量
    public int maxHP;//最大血量
    public int attack;//攻击力
    public int defense;//防御力

    public Character() {
    }

    public Character(String name, int HP, int attack, int defense) {
        this.name = name;
        this.HP = HP;
        this.maxHP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public Boolean isAlive() {
        return HP > 0;
    }

    public void heal(int amount) {
        this.HP += amount;
        if (this.HP > maxHP) {
            this.HP = maxHP;
        }
    }

    // 受伤 还剩下多少血量
    public void takeDamage(int amount) {
        HP -= amount;
        if (HP < 0) {
            HP = 0;
        }
    }

    public String show() {
        return  name + "[当前血量：" + HP + "，攻击力：" + attack + "，防御力：" + defense+"]";
    }
}
