package com.lryg.sday2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Dome {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        ArrayList<String> list2 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {


            Random r = new Random();
            int count = list.size();
            for (int i = 0; i < count; i++) {
                int index = r.nextInt(list.size());
                String temp = list.get(index);
                list.remove(index);
                list2.add(temp);
            }
            list.addAll(list2);
            list2.clear();
            System.out.println(list);

        }
    }
}
