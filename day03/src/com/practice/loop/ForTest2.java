package com.practice.loop;

public class ForTest2 {
    public static void main(String[] args) {
        // 目标：for循环求和
        System.out.println("1到5的和是：" + sum(100));
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
