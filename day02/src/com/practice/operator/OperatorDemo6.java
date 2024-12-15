package com.practice.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标：掌握逻辑运算符的使用。
        System.out.println(isMatch(180, 70, '女'));
        System.out.println(isMatch(180, 70, '男'));

        System.out.println(isMatch2(180, 10000));
        System.out.println(isMatch2(160, 1000000));
        System.out.println(isMatch2(160, 100)); // false

        isMatch3(true);

        System.out.println("----------");

        isMatch4();

        System.out.println("-----------");

        print();
    }

    public static boolean isMatch(int height, int weight, char sex) {
        boolean result = height > 170 & weight >= 60 & weight <= 80 & sex == '女';
        return result;
    }

    //找一个男朋友，要求是要么身高高于180，要么收入高于30万。
    public static boolean isMatch2(int height, int income) {
        boolean result = height >= 180 | income > 300000;
        return result;
    }

    public static void isMatch3(boolean flag) {
        System.out.println(!flag);
    }

    //^相同条件结果为false，条件不同为true.
    public static void isMatch4() {
        System.out.println(false ^ false);
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
    }

    //&& || 与 & |的区别
    public static void print() {
        int a = 111;
        int b = 2;
        // System.out.println(a > 1000 && ++b > 1);//短路
        System.out.println(a > 1000 & ++b > 1);
        System.out.println(b);

        int i = 10;
        int j = 20;
        System.out.println(i > 6 | ++j > 1);
        System.out.println(j);
    }

}
