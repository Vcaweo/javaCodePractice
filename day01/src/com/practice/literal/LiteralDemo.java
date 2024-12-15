package com.practice.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }

    public static void printLiteral() {
        // 1、整型字面量，直接写
        System.out.println(1);
        // 2、浮点型字面量，直接写（小数）
        System.out.println(1.0);
        // 3、布尔型字面量，只有true false
        System.out.println(true);
        System.out.println(false);

        // 4、字符型字面量，用单引号括起来，里面有且仅有一个字符
        System.out.println('a');
        System.out.println('磊');
        System.out.println(' ');
        // System.out.println('');// 报错

        // 掌握一些特殊的字符：\n(换行功能) \t（Tab缩进功能）
        System.out.println("hello\nWorld");
        System.out.println("hello\tWorld");

        // 5、字符串字面量，用双引号括起来，里面可以有任意字符
        System.out.println("aaa");

    }
}
