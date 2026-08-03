package com.lryg.s03;

import java.io.File;

public class Filelearning {
    public static void main(String[] args) {
        String str ="C:\\Users\\Lenovo\\Desktop\\111.txt";
        File file = new File(str);
        System.out.println(file);
        String parent ="C:\\Users\\Lenovo\\Desktop";
        File file1 = new File(parent,"111.txt");
        System.out.println(file1);
        File[] file2 = File.listRoots();
        for (File file3 : file2) {
            System.out.println(file3);
        }
    }
}
