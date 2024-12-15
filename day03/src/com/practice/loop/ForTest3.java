package com.practice.loop;

public class ForTest3 {
    public static void main(String[] args) {
        // 目标：奇数和
        System.out.println("1-10的奇数和是：" + sum(10));
        System.out.println("1-10的奇数和是：" + sum2(10));
    }
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

}
