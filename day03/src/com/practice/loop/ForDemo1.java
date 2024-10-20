package com.practice.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1() {
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("=================");

        for (int i = 1; i < 6; i++) {
            // i = 1、2、3、4、5
            System.out.println("HelloWorld");
        }
        System.out.println("===============");
        for (int i = 1; i <= 9; i+=2) {
            System.out.println("HelloWorld");
        }
    }
}
