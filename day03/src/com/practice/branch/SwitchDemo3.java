package com.practice.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //目标：switch分支结构
        test1();
    }

    //需求：根据性别推荐书本
    public static void test1() {
        // 1、让用户输入选择自己的性别。
        System.out.println("请输入您的性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();

        switch (sex) {
            case "男":
                System.out.println("推荐《Java从入门到精通》");
                break;
            case "女":
                System.out.println("推荐《从您的全世界路过》");
                break;
            default:
                System.out.println("你不是人，没有东西推荐！");
        }
    }
}
