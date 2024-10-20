package com.practice.loop;

public class DeadForDemo7 {
    public static void main(String[] args) {
        //目标：死循环
        test();
    }

    public static void test(){
//        for ( ; ; ) {
//            System.out.println("Hello World1!");
//        }
//        while (true) {
//            System.out.println("Hello World2!");
//        }
        do {
            System.out.println("Hello World3!");
        }while (true);
    }
}
