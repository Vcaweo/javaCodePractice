package com.practice.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        printArray();
        printArray2();
    }
    public static void printArray()
    {
        //二维数组，学生座位信息
        String[][] classroom = {
                {"张三","李四","王五"},
                {"赵六","钱七","孙八"},
                {"周九","吴十","郑十一","伍六七"},
                {"王十二","李十三","赵十四"}
        };
        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        //列索引
        System.out.println(classroom[1][1]);
        System.out.println(classroom[2][2]);
        //动态初始化二维数组
        int[][] arr = new int[3][5];
    }
    //遍历二维数组
    public static void printArray2()
    {
        String[][] classroom = {
                {"张三","李四","王五"},
                {"赵六","钱七","孙八"},
                {"周九","吴十","郑十一","伍六七"},
                {"王十二","李十三","赵十四"}
        };
        for (int i = 0; i < classroom.length; i++){
            String[] names = classroom[i];
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++)
                System.out.print(classroom[i][j] + " ");
        }
        System.out.println();
    }
}
