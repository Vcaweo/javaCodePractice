package com.practice.branch;
import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //目标：if语句
        test1();
        test2();
        test3();
    }

    public static void test1(){
        int age = 10;
        if(age > 18){
            System.out.println("可以上网");
        }
        System.out.println("洗洗睡吧！");
    }

    public static void test2(){
        int money = 10;
        if(money >= 80){
            System.out.println("转账成功");
        }else{
            System.out.println("余额不足");
        }
    }

    public static void test3(){
        //需求：绩效系统
        System.out.println("请您录入员工的分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("A+");
        }else if(score >= 80 && score < 90){
            System.out.println("A");
        }else if(score >= 70 && score < 80){
            System.out.println("B");
        }else if(score >= 60 && score < 70){
            System.out.println("C");
        }else if(score >= 0 && score < 60){
            System.out.println("D");
        }else {
            System.out.println("输入有误");
        }
    }
}
