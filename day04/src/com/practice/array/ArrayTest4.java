package com.practice.array;

public class ArrayTest4 {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        //定义一个数组存储54张扑克牌
        String[] poker = new String[54];
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index] = colors[j] + numbers[i];
                index++;
            }
        }
        poker[index] = "Big Joker";
        poker[index+1] = "Small Joker";
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();
        //将牌打乱
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int)(Math.random()*poker.length);
            int index2 = (int)(Math.random()*poker.length);
            String temp = poker[index1];
            poker[index1] = poker[index2];
            poker[index2] = temp;
        }
        //洗牌后
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();
    }
}
