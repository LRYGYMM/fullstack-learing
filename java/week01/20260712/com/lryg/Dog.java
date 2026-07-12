package com.lryg;

public class Dog {

        private String name;
        private int age;
        public void setName(String value) {
            name = value;
        }

        public String getName() {
            return name;
        }

        public void setAge(int value) {
            if(value>=1&&value<=16){
                age = value;
            }else{
                System.out.println("年龄设置错误");
            }
        }
        public int getAge() {
            return age;
        }
        public void eat() {
            System.out.println(age+"岁的"+name+"正在吃骨头");
        }
}
