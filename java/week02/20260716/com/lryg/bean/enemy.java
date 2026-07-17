package com.lryg.bean;

public class enemy extends Character {
    public String skill;
    public Boolean defending = false;

    //空参
    public enemy() {
    }

    //带参
    public enemy(String name, int HP, int attack, int defense, String skill) {
        super(name, HP, attack, defense);
        this.skill = skill;

    }

    @Override
    public void takeDamage(int damage) {
        //如果处于防御状态的话 伤害减半
        if (defending) {
            damage = damage / 2 > 1 ? damage / 2 : 1;
            defending = false;
        }
        //调用父类的takeDamage方法
        super.takeDamage(damage);
    }

}
