package com.practice.loop;

public class DoWhileDemo6 {
    public static void main(String[] args) {
        //目标：do-while循环
        test1();
    }
    public static void test1() {
        int i = 0;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i < 3);
    }
}
