package com.kevll.blade;

/**
 * @author: Kevin Zhang
 * @date: 2018/12/12
 */
public class Q11_NumberOf1 {
    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */

    public static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static int numberOf1Java(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(1));
        System.out.println(numberOf1(-1));

        System.out.println(numberOf1Java(1));
        System.out.println(numberOf1Java(-1));
    }
}
