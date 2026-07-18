package com.lryg.u1;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.lryg.bean.User;

import javax.xml.transform.Source;


public class Login {


    public void start() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("╔════════════════════════════════╗");
            System.out.println("    🎮 欢迎来到文字格斗游戏 🎮   ");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> login(list);
                case 2 -> register(list);
                case 3 -> forgotPassword(list);
                case 4 -> {
                    System.out.println("谢谢你的使用");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }
    /*
    * 1. id：

* 用户无法设置，是自动生成的，格式为：Fight+5位数字的随机数

2. 用户名username：

* 用户名唯一
* 长度必须在3 ~ 16位
* 只能由字母、数字组成，不能是纯数字

3，密码要求：

* 长度3 ~ 8位
* 只能是字母加数字的组合，不能有其他字母

* 注册时候，各属性需要满足要求
* 密码键盘输入两次，两次一致才可以进行注册

    *
    * */
    public void forgotPassword(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        //输入用户名，查询用户名是否存在
        //不存在:提示当前用户名未注册

        while (true) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            if (!contains(username, list)) {
                System.out.println("当前用户名未注册");
                continue; // 原return改成continue，循环重输
            }
            //存在:输入手机号，并验证
            System.out.println("请输入手机号：");
            String phone = scanner.next();
            if (!containsPhone(phone, list)) {
                System.out.println("当前手机号不存在，请重新输入");
                continue; // 原return改成continue
            }
            int index = findIndex(username, list);
            int index2 = findIndexByPhone(phone, list);
            System.out.println("用户名下标：" + index);
            System.out.println("手机号下标：" + index2);
            //用户名手机号不匹配，重新从头输入
            if (index != index2){
                System.out.println("用户名和手机号不属于同一用户，请重新操作");
                continue;
            }
            //手机号正确，输入新密码
            System.out.println("请输入新密码：");
            String password = scanner.next();
            System.out.println("请输入新密码：");
            String password2 = scanner.next();
            if (!password.equals(password2)) {
                System.out.println("两次输入的密码不一致");
                continue; // 不return，重新输密码
            }
            list.get(index).setPassword(password);
            System.out.println("修改密码成功");
            break;
        }
        //修改密码成功
    }


    //注册方法
    public void register(ArrayList<User> list) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        //判断用户名
        //* 用户名唯一
        //* 长度必须在3 ~ 16位
        //* 只能由字母、数字组成，不能是纯数字
        while (true) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            if (!checkLen(3, 16, username)) {
                System.out.println("用户名长度必须在3 ~ 16位");
                continue;
            }
            //只能由字母、数字组成，不能是纯数字
            if (!checkUsername(username)) {
                System.out.println("用户名只能由字母、数字组成，不能是纯数字");
                continue;
            }
            if (contains(username, list)) {
                System.out.println("用户名已存在");
                continue;
            }
            user.setUsername(username);
            break;
        }

        //判断手机号
        while (true){
            System.out.println("请输入手机号：");
            String phone = scanner.next();
            if (!checkLen(11, 11, phone)) {
                System.out.println("手机号长度必须在11位");
                continue;
            }
            //只能由字母、数字组成，不能是纯数字
            if (!checkPhone(phone)) {
                System.out.println("手机号只能由数字组成，并且必须以1开头");
                continue;
            }
            if (contains(phone, list)) {
                System.out.println("手机号已存在");
                continue;
            }
            user.setPhone(phone);
            break;

        }
        //判断密码
        //长度3 ~ 8位
        //* 只能是字母加数字的组合，不能有其他字母
        //密码要输两次，两次一致才可以进行注册
        while (true) {
            System.out.println("请输入密码：");
            String password = scanner.next();
            if (!checkLen(3, 8, password)) {
                System.out.println("密码长度必须在3 ~ 8位");
                continue;
            }
            //只能由字母、数字组成，不能是纯数字
            int[] arr = getcount(password);
            if (!checkPasswd(arr)) {
                System.out.println("密码只能由字母+数字组成，不能是纯数字");
                continue;
            }
            System.out.println("请输入密码：");
            String password2 = scanner.next();
            if (!password.equals(password2)) {
                System.out.println("两次输入的密码不一致");
                continue;
            }
            user.setPassword(password);
            break;

        }

        list.add(user);
        System.out.println("恭喜用户：" + user.getUsername() + "注册成功，id:" + user.getId());
    }

    //登录
    public void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        //判断用户名是否存在
        if (!contains(username, list)) {
            System.out.println("用户名不存在,请先注册");
            //如果用户名不存在 提示用户先注册 结束登陆的操作
            return;
        }
        //不存在:提示未注册
        // 存在:禁用，提示联系客服~
        int index = findIndex(username, list);
        User u = list.get(index);
        if (!u.getStatus()) {
            System.out.println("账号已禁用，请联系客服");
            return;
        }
        // 存在:验证密码是否正确(三次)
        // 验证密码是否正确(三次)*/
        String rightpasswd = u.getPassword();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码：");
            String password = sc.next();
            while (true) {
                //先去生成一共正确的验证码
                String rightCode = getCode();
                System.out.println("正确的验证码:" + rightCode);
                System.out.println("请输入验证码：");
                String code = sc.next();
                if (!code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码错误");
                    continue;
                } else {
                    System.out.println("验证码正确");
                    break;
                }
            }
            // 验证密码是否正确(三次)*/
            if (password.equals(rightpasswd)) {
                System.out.println("密码正确，开始游戏");
                FightGame fg = new FightGame();
                fg.gameStart(username);
                break;
            } else {
                System.out.println("密码错误");
                if (i == 2) {
                    // 密码错误次数过多，账号已锁定
                    System.out.println("密码错误次数过多，账号已锁定");
                    u.setStatus(false);
                    System.out.println("账号已锁定" + username + ",请联系客服");
                    return;
                } else {
                    System.out.println("密码错误，请重新输入，还剩" + (2 - i) + "次机会");
                }
            }
        }
    }

    //在集合当中username的索引
    public int findIndex(String username, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }
    // 根据手机号找下标
    public int findIndexByPhone(String phone, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getPhone().equals(phone)) {
                return i;
            }
        }
        return -1;
    }

    //判断长度是否符合要求
    public Boolean checkLen(int minLen, int maxLen, String str) {
        return str.length() >= minLen && str.length() <= maxLen;
    }

    //判断用户名在集合中是否存在
    public Boolean contains(String username, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    //判断手机号在集合中是否存在
    public Boolean containsPhone(String phone, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if(list.get(i).getPhone().equals(phone)){
                return true;
            }
        }
        return false;
    }

    //判断用户名是否符合要求，，只能由字母、数字组成，不能是纯数字
    public Boolean checkUsername(String str) {
        int charCount = 0;
        int digitCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                charCount++;
            } else if (c >= '0' && c <= '9') {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        return charCount > 0 && otherCount == 0;
    }

    //判断密码是否符合要求，只能由字母+数字组成，不能是纯数字
    public Boolean checkPasswd(int[] count) {
        return count[0] > 0 && count[1] > 0 && count[2] == 0;
    }
    //判断手机号是否符合要求，只能由数字组成，必须以1开头
    public Boolean checkPhone(String phone) {
        char c = phone.charAt(0);
        if (c != '1') {
            return false;
        }
        int[] arr = getcount(phone);
        return arr[0] == 0 && arr[1] > 0 && arr[2] == 0;
    }
    //获取字符串中字母、数字、其他字符的个数
    public int[] getcount(String str) {
        int charCount = 0;
        int digitCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                charCount++;
            } else if (c >= '0' && c <= '9') {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        return new int[]{charCount, digitCount, otherCount};
    }

    //生成随机数
    public static String getCode() {
        Random r = new Random();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('A' + i));
            list.add((char) ('a' + i));
        }
        //生成随机索引
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            sb.append(list.get(index));
        }
        sb.append(r.nextInt(9));
        //打乱数字
        char[] arry = sb.toString().toCharArray();
        //找到索引
        int i = r.nextInt(arry.length - 1);
        //交换索引和随机索引的值
        char temp = arry[i];
        arry[i] = arry[arry.length - 1];
        arry[arry.length - 1] = temp;
        String str = new String(arry);
        return str;
    }
}


