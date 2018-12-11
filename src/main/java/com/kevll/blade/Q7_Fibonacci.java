package com.kevll.blade;

import org.junit.Test;

/**
 * @author: kevin
 * @date: 2018/6/15
 * @description:
 */
public class Q7_Fibonacci {
    /**
     * 递归和循环    斐波那契数列
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
     * n<=39
     * 1、1、2、3、5、8、13、21、34、
     */

    public int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[n - 1];
    }

    @Test
    public void test() {
        System.out.println(Fibonacci(7));
    }
}
