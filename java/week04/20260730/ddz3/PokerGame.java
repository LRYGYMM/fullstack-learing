package ddz3;


import java.util.*;

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
        order(player1);
        order(player2);
        order(player3);
        order(lord);



        //看牌
        lookPokers("底牌",lord);
        lookPokers("玩家1",player1);
        lookPokers("玩家2",player2);
        lookPokers("玩家3",player3);



    }
    // 排序的方法
    public void order(ArrayList<String> list){
        Collections.sort(list, ( o1,  o2)-> {
                //o1 o2 索引
            String color1 = o1.substring(0, 1);
            int value1 = getValue(o1);
            String color2 = o2.substring(0, 1);
            int value2 = getValue(o2);
            int i = value1 - value2;
            return i == 0 ? color1.compareTo(color2) : i;

        });
    }
    // 获取牌的价值
    public int getValue(String poker){
        String number = poker.substring(1);
        if(hm.containsKey(number)){
            return hm.get(number);
        }else{
            return Integer.parseInt(number);

        }
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
    //牌价值
    static HashMap<String,Integer> hm = new HashMap<>();
    static {
        String[] colors = {"♠","♥","♣","♦"};
        String[] muber = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String m : muber){
            for(String c : colors){
                list.add(c+ m);
            }
        }
        list.add(" 小王");
        list.add(" 大王");
        //牌的价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);

    }

    }


