package com.practice.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：掌握方法的定义和调用。
        int sum = getSum(10, 20);
        System.out.println("和是：" + sum);
        System.out.println("----------------------------");
        int sum2 = getSum(100, 200);
        System.out.println("和是：" + sum2);
        printHelloWorld();
        System.out.println("----------------------------");
        System.out.println(getCode(4));
        System.out.println(getCode(5));
    }

    //定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a, int b) {
        return a + b;
    }

    //需求：打印3行HelloWorld
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //需求：获取一个指定位数的验证码返回。
    public static String getCode(int len) {
        String code = "";
        for (int i = 0; i < len; i++) {
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }
}
