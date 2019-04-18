package com.kevll.blade;

import java.math.BigDecimal;

/**
 * @author: kevin
 * @date: 2019/4/18
 * @description:
 */
public class Q12_Power {

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     */


    public static double power(double base, int exponent) {

        if (exponent == 0)
            return 1;

        double power = 1;

        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                power *= base;
            }
        } else {
            for (int i = 0; i < exponent * -1; i++) {
                power *= base;
            }
            BigDecimal powerD = BigDecimal.valueOf(power);
            BigDecimal one = BigDecimal.valueOf(1);
            power = one.divide(powerD).doubleValue();
        }

        return power;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 0));
        System.out.println(power(2, 3));
        System.out.println(power(2, -3));
    }
}
