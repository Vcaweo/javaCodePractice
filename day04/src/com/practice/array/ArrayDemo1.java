package com.practice.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        randomCall();
    }
    public static void randomCall(){
        String[] names = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
        //随机获取一个索引值
        int index = (int)(Math.random()*names.length);
        //0-1，元素个数5，0-4正好是索引值
        System.out.println(index);
        System.out.println(names.length);
        System.out.println(names);
        System.out.println(names[index]);
    }
}
