package com.kevll.blade;

import org.junit.Test;

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
            n = n & (n - 1);    // n-1把最右边的1变为0，之后的0都变为1，相与后抵消。所以每次n与n-1做与运算后，1的个数会减少一个
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

    @Test
    public void test() {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1).length());

        System.out.println(Integer.toBinaryString(-1 - 1));    // 负数也是抵消
    }
}
