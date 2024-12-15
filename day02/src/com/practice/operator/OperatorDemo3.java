package com.practice.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握赋值运算符。
        receive(5);
        print();
    }

    // 需求：收红包。
    public static void receive(int b) {
        // 拿到自己钱包的金额。
        int a = 100;
        a += b;
        System.out.println("收红包后，我的钱包金额：" + a);

        byte a1 = 10;
        byte a2 = 20;
        a1 += a2;
        System.out.println(a1);
    }

    //演示其他几个扩展的赋值运算符。
    public static void print() {
        int a = 10;
        a -= 5;
        System.out.println(a);

        int b = 10;
        b *= 5;
        System.out.println(b);

        int c = 10;
        c /= 5;
        System.out.println(c);

        int d = 10;
        d %= 5;
        System.out.println(d);
    }
}
