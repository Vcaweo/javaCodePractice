package com.practice.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //目标：自动类型提升。
        int result = calc2((byte) 110, (byte) 120);
        System.out.println(result);

        int result2 = calc3((byte) 110, (byte) 120);
        System.out.println(result2);
    }

    // 需求：接收各种类型的数据运算。
    public static double calc(int a, int b, double c, char r) {
        return a + b + c + r;//表达式的最终结果类型是由最高类型决定的
    }

    public static int calc2(byte a, byte b) {
        return a + b;//byte short char运算时会直接提升为int。
    }

    public static byte calc3(byte a, byte b) {
        byte c = (byte) (a + b);
        return c;
    }
}
