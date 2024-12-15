package com.practice.demo;

public class Test3 {
    public static void main(String[] args) {
        //目标：验证码。
        System.out.println(getCode(4));
        System.out.println(getCode(6));

    }

    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    int num1 = (int) (Math.random() * 26);
                    char ch = (char) (65 + num1);
                    code += ch;
                    break;
                case 2:
                    int num2 = (int) (Math.random() * 26);
                    char ch1 = (char) (97 + num2);
                    code += ch1;
                    break;
            }
        }
        return code;
    }
}
