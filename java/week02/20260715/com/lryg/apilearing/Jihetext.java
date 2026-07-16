package com.lryg.apilearing;

import java.util.ArrayList;
import java.util.Stack;

public class Jihetext {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 18, "001");
        Student s2 = new Student("王五", 19, "002");
        Student s3 = new Student("李四", 20, "003");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getAge() + " " + list.get(i).getId());
        }
        int index=findstudent("002", list);
        System.out.println(index);
    }

    public static int findstudent(String id, ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        //只有循环结束了 说明循环里的数据找完了 如果还没有找到 说明没有这个数据
        return -1;

    }
}
