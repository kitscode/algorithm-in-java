package com.kevll.blade;

import org.junit.Test;

/**
 * @author: kevin
 * @date: 2018/6/8
 * @description:
 */
public class Q1_SearchIn2dArray {
    /**
     * 数组   二位数组中的查找
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    /**
     * 思路
     * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
     * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
     * 要查找数字比左下角数字小时，上移
     */

    static boolean find(int x, int[][] array) {
        int row = array.length;
        int column = array[0].length;
        //i行、j列
        for (int i = column - 1, j = 0; i >= 0 && j < column; ) {
            if (x == array[i][j])
                return true;
            if (x < array[i][j]) {
                i--;
                continue;
            }
            if (x > array[i][j]) {
                j++;
                continue;
            }

        }
        return false;
    }

    public static boolean find_k(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    static int[][] array = {{2, 4, 10, 16}, {6, 8, 12, 17}, {30, 37, 49, 80}, {78, 90, 113, 215}};
    static int target = 215;

    public static void main(String[] args) {

        long s = System.nanoTime();
        System.out.println(find(target, array) + "\ntime: " + (System.nanoTime() - s));

        //只是遍历
//        long s2=System.nanoTime();
//        System.out.println(find_k(target,array)+"\ntime: "+(System.nanoTime()-s2));


        long s3 = System.nanoTime();
        System.out.println(find(target, array) + "\ntime: " + (System.nanoTime() - s3));


        long s4 = System.nanoTime();
        System.out.println(find(target, array) + "\ntime: " + (System.nanoTime() - s4));

        long s5 = System.nanoTime();
        System.out.println(find(target, array) + "\ntime: " + (System.nanoTime() - s5));

        long s6 = System.nanoTime();
        System.out.println(find(target, array) + "\ntime: " + (System.nanoTime() - s6));

        //为什么相同的方法，随程序启动时间越长，执行时间越短？
    }

    @Test
    public void test() {
        long s2 = System.nanoTime();
        System.out.println(find_k(target, array) + "\ntime: " + (System.nanoTime() - s2));
    }
}
