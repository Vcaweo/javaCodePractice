package com.practice.array;

public class ArrayTest6 {
    public static void main(String[] args) {
        start(4);
    }
    public static void start(int n)
    {
        //定义一个二维数组存储数字列表，数字华容道
        int[][] arr = new int[n][n];
        //遍历并赋值
        int count = 1;
        for (int i = 0;i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
        }
        printArray(arr);
        //打乱
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int index1 = (int)(Math.random() * arr.length);
                int index2 = (int)(Math.random() * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[index1][index2];
                arr[index1][index2] = temp;
            }
            System.out.println();
            System.out.println("================");
            printArray(arr);
        }
    }
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
