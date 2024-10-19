package com.practice.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：认识方法重载。
    }

    // 定义一个方法，打印一个整数
    public static void print(int a) {
        System.out.println(a);
    }

    // 定义一个重载的方法
    public static void print(String str) {
        System.out.println(str);
    }

    // 定义一个重载的方法
    public static void print(double d, int a) {
        System.out.println(d);
    }

    public static void print(int a, double d) {
        System.out.println(d);
    }

    // 需求：发射导弹
    public static void fire(int x, int y) {
        System.out.println("发射导弹，坐标：" + x + "," + y);
    }

    // 定义一个重载方法
    public static void fire(double x, double y, String location) {
        System.out.println("发射导弹，坐标：" + x + "," + y);
    }
}
