package com.practice.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：三元运算符。
        print(10, 40);
        print(59);
        System.out.println("较大值：" + getMax(10, 20, 30));
        System.out.println("较大值：" + getMax2(10, 20, 30));
    }
    public static void print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("较大值：" + max);
    }

    //判断成绩是否通过或者挂科
    public static void print(int score) {
        String result = score >= 60 ? "通过" : "挂科";
        System.out.println(result);
    }
    //求三个整数的较大值
    public static int getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
    public static int getMax2(int a, int b, int c) {
        //三元运算符的嵌套
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        return max;
    }
}
