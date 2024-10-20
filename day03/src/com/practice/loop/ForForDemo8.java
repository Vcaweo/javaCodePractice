package com.practice.loop;
public class ForForDemo8 {
    public static void main(String[] args) {
        // 目标：循环嵌套
        test();
        print99();
    }
    
    public static void test(){
        //打印4行5列星星。
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print99(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
