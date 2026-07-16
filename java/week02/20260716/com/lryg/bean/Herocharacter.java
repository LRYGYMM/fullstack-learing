package com.lryg.bean;

import java.util.ArrayList;

public class Herocharacter extends Character {
    public ArrayList<String> skills; // 技能列表

    public Herocharacter(ArrayList<String> skills) {
        this.skills = skills;
    }

    //空参
    public Herocharacter() {
        super();
        skills = new ArrayList<>();

    }

    public Herocharacter(String name, int HP, int attack, int defense, ArrayList<String> skills) {
        super(name, HP, attack, defense);
        this.skills = new ArrayList<>();
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
}
