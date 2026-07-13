package com.lryg;

public class static_learing {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.setName("张三");
        st.setAge(18);
        System.out.println(st.getName()+","+st.getAge()+","+ Student1.teachername);
        Student1.teachername="zhang";
        Student1 st1 = new Student1();
        st1.setName("李四");
        st1.setAge(19);
        Student1.teachername="li";
        System.out.println(st1.getName()+","+st1.getAge()+","+ Student1.teachername);
        System.out.println(st.getName()+","+st.getAge()+","+ Student1.teachername);
    }
}
