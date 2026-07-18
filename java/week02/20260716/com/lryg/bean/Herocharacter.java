package com.lryg.bean;

import java.util.ArrayList;

public class Herocharacter extends Character {
    public ArrayList<String> skills; // 技能列表
    public int blueHP =10;
    public int MaxblueHP=10;
    public ArrayList<Consumable> packageList;

    public Herocharacter(ArrayList<String> skills) {
        this.skills = skills;
        this.packageList = new ArrayList<>();
    }

    public Herocharacter() {
        super();
        skills = new ArrayList<>();
        packageList = new ArrayList<>();
    }

    public Herocharacter(String name, int HP, int attack, int defense, int blueHP, ArrayList<String> skills) {
        super(name, HP, attack, defense);
        this.blueHP = blueHP;
        this.MaxblueHP = MaxblueHP;
        this.skills = new ArrayList<>();
        this.packageList = new ArrayList<>();
    }

    public void Mp(int amount) {
        blueHP -= amount;
        if (blueHP < 0) {
            blueHP = 0;
        }
    }

    public String showSkill(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < skills.size(); i++) {
            sb.append(skills.get(i));
            if (i != skills.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void showPackage() {
        if (packageList.isEmpty()) {
            System.out.println("🎒 背包为空");
            return;
        }
        System.out.println("🎒 背包道具：");
        for (int i = 0; i < packageList.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + packageList.get(i));
        }
    }

    public boolean useConsumable(int index) {
        if (index < 0 || index >= packageList.size()) {
            return false;
        }
        Consumable c = packageList.get(index);
        this.heal(c.getNum());
        System.out.println("🍗 使用了 " + c.getName() + "，恢复了 " + c.getNum() + " 点生命！");
        packageList.remove(index);
        return true;
    }
}
