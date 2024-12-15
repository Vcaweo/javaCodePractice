package com.practice.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //目标：switch的注意事项，穿透性的应用。
        test1();
        test2();
    }
    public static void test2() {
        int a = 10;
        int b = 15;
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("10");
                break;
            default:
                System.out.println("default");
        }
    }

    public static void test1() {
        String week = "周六";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                    System.out.println("星期信息有误！");
        }
    }
}
