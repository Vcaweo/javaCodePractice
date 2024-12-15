package com.practice.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        inputScore();
    }
    public static void inputScore(){
        //存储8名学生成绩
        //动态初始化数组
        double[] scores = new double[8];
        System.out.println("请输入8个学生的成绩：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores [i] = sc.nextDouble();
        }
        //遍历数组,输出所有学生成绩,最高分，最低分，平均分，总分
        double allScore = scores[0];
        double maxScore = scores[0];
        double minScore = scores[0];
        //从第二个位置遍历的技巧：i=1
        for(int i = 1; i < scores.length; i++) {
            double score = scores[i];

            allScore += scores[i];

            if(score > maxScore) {
                maxScore = score;
            }

            if(score < minScore) {
                minScore = score;
            }
        }
        System.out.println("平均分："+allScore/scores.length);
        System.out.println("最高分："+maxScore);
        System.out.println("最低分："+minScore);
        System.out.println("总分："+allScore);
    }
}
