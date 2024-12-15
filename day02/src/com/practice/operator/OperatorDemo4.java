package com.practice.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标：理解关系运算符。
        print(10, 2);
        print2(10, 10);
    }

    public static void print(int a, int b) {
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public static void print2(int a, int b) {
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
