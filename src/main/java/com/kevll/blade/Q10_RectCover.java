package com.kevll.blade;

/**
 * @author: Kevin Zhang
 * @date: 2018/12/12
 */
public class Q10_RectCover {
    /**
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     */

    static int rectCover(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2, sum = 0;
        for (int i = 2; i < n; i++) {
            sum = pre2 + pre1;
            pre2 = pre1;
            pre1 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(rectCover(3));
    }
}
