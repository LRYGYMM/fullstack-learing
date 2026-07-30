package ddz2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer,String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] colors = {"♠","♥","♣","♦"};
        String[] muber = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int series = 1;
        for (String m : muber){
            for (String c : colors){
                hm.put(series,c+m);
                list.add(series);
                series++;
            }
        }
        hm.put(series,"小王");
        list.add(series);
        series++;
        hm.put(series,"大王");
        list.add(series);


    }

    public PokerGame() {
        Collections.shuffle(list);
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int series = list.get(i);
            if (i <= 2){
                lord.add(series);
                continue;
            }
            if (i % 3 == 0){
                player1.add(series);
            }else if (i % 3 == 1){
                player2.add(series);
            }else {
                player3.add(series);
            }
        }
        //看牌
        lookPokers("底牌",lord);
        lookPokers("玩家1",player1);
        lookPokers("玩家2",player2);
        lookPokers("玩家3",player3);


    }
    public void lookPokers(String name,TreeSet<Integer> list){
        System.out.println(name+":");

        for (int series : list) {
            System.out.print(hm.get(series)+" ");
        }
        System.out.println();
    }

}
