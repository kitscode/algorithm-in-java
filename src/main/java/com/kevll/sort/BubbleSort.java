package com.kevll.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {12, 30, 13, 4, 9, 10, 28, 54, 2, 60, 11, 7};

        /**
         * 冒泡排序实际是拿每一个元素和后面的元素进行依次比较，
         * 所以每轮比较后将会把当前未排序的数字中最大或最小的值排到最后，
         * 故每次比较的次数都会减一，也就是第二层循环会递减，排完n-1次后，第一个数不需要再排列，
         * 其时间复杂度的计算过程如下：
         * (n-1)+(n-2)+(n-3)+…+1+0
         * = (n-1)*(n-1+1)/2=(n^2-n)/2
         * 舍弃低次幂得到O=n^2
         */

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }


        for (int i : array) {
            System.out.println(i);
        }
    }

}
