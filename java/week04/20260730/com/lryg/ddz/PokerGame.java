package com.lryg.ddz;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        System.out.println(list);
        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lord = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2){
                lord.add(poker);
            }
            if (i % 3 == 0){
                player1.add(poker);
            }else if (i % 3 == 1){
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }
        //排序 索引 使用hashmap



        //看牌
        lookPokers("底牌",lord);
        lookPokers("玩家1",player1);
        lookPokers("玩家2",player2);
        lookPokers("玩家3",player3);



    }

    //name 玩家的名字
    // list 玩家的牌
    public void lookPokers(String name,ArrayList<String> list){
        System.out.println(name+"的牌是:");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
        //"♠","♥","♣","♦"
        //准备牌
    //牌盒
    static ArrayList<String> list = new ArrayList<>();
    static {
        String[] colors = {"♠","♥","♣","♦"};
        String[] muber = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String m : muber){
            for(String c : colors){
                list.add(c+ m);
            }
        }
        list.add("小王");
        list.add("大王");
        }

}
