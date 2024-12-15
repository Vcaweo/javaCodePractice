package com.practice.branch;

public class IfTest2 {
    public static void main(String[] args) {
        //目标：红绿灯
        test1();
    }
    public static void test1() {
        boolean red = false;
        boolean yellow = false;
        boolean green = false;
        if (red) {
            System.out.println("红灯亮，停止！");
        } else if (yellow) {
            System.out.println("黄灯亮，准备！");
        } else if (green) {
            System.out.println("绿灯亮，开始！");
        } else {
            System.out.println("灯泡故障，停止！");
        }
    }
}
