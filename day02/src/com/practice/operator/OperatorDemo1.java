package com.practice.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚基本的算术运算符。
        print(10, 3);

        System.out.println("------------");

        print2();
    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);
    }
    public static void print2() {
        int a = 5;
        System.out.println("abc" + a);
        System.out.println(a + 5);
        System.out.println("itheima" + a + 'a');
        System.out.println(a + 'a' + "itheima");
    }
}
