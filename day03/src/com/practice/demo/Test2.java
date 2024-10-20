package com.practice.demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 目标：猜数字游戏
        guess();
    }

    public static void guess() {
        //目标：1-100之间随机数
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入猜测的数字：");
            int guessNumber = sc.nextInt();
            if (guessNumber == luckNumber) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guessNumber > luckNumber) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
        }
    }
}
