package com.kevll.blade;

/**
 * @author: kevin
 * @date: 2018/6/15
 * @description:
 */
public class Q8_JumpFloor {
    /**
     * 递归和循环    跳台阶
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */


    /**
     * 青蛙跳1级台阶有1种跳法，2级台阶有2种跳法，3级台阶时可以从1级台阶跳上来也可以从2级台阶跳上来，即等于1级台阶的跳法加2级台阶的跳法
     * 因此n级台阶共有n-2级台阶跳法数+n-1级台阶跳法数，变成了一个斐波那契数列，只是初始的几个值不相同
     */
    static int jumpFloor(int n) {
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
        System.out.println(jumpFloor(10));
    }
}

