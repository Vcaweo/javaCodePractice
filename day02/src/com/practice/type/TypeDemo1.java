package com.practice.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：认识自动类型转换，强制类型转换。
        byte a = 12;
        print(a);
        print2(a);

        System.out.println("=====================");

        int i = 20;
        byte j = (byte) i;
        print3(j);

        System.out.println("=====================");

        int m = 1500;
        byte n = (byte) m;
        System.out.println(m);
        System.out.println(n);
        System.out.println("=====================");

        double k = 3.14;
        int l = (int) k;
        System.out.println(l);
    }

    public static void print(int b) {
        System.out.println(b);
    }

    public static void print2(double c) {
        System.out.println(c);
    }

    public static void print3(byte j) {
        System.out.println(j);
    }
}
