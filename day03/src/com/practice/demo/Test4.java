package com.practice.demo;

public class Test4 {
    public static void main(String[] args) {
        //目标：找出101-200之间的全部素数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数的个数为：" + count);
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
