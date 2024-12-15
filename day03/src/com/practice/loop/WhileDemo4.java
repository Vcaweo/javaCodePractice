package com.practice.loop;

public class WhileDemo4 {
    public static void main(String[] args) {
        //目标：while循环
        test1();
    }
    public static void test1() {
        int i = 0;
        while (i < 3) {
            System.out.println("Hello World!");
            i++;
        }
        System.out.println(i);
    }
}
