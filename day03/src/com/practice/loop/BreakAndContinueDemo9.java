package com.practice.loop;

public class BreakAndContinueDemo9 {
    public static void main(String[] args) {
        //目标：break和continue
        test2();
    }

    public static void test1() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void test2() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
