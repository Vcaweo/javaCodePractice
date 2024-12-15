package com.practice.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("--------------------------------");
        printHelloWorld();
        System.out.println("--------------------------------");
        System.out.println(sum(1, 2));
    }
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
    public static int sum(int a, int b) {
        return a + b;
    }
}
