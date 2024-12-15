package com.practice.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目标：理解自增自减运算符
        print(10);
        System.out.println("=========================");
        print2(10);
    }
    public static void print(int a) {
        a++; // a = a + 1;
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }

    // 设计一个方法，理解自增和自减放在变量前后的区别
    public static void print2(int a) {
        int b = a++; //先用后加
        System.out.println(a);
        System.out.println(b);

        int c = ++a; //先加后用
        System.out.println(a);
        System.out.println(c);
    }
}
