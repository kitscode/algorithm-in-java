package com.kevll.sort.quicksort;

import java.util.Arrays;

/**
 * @author kevin
 * @date 2018年2月26日
 */
public class QuickSortSimple {

    public static void main(String[] args) {
        int[] array = {12, 30, 13, 4, 9, 10, 28, 54, 2, 60, 11, 7};
        quick_sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    // Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1

    // 快速排序
    static void quick_sort(int array[], int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int x = array[left];    //选取第一个数为基准数

            while (i < j) {
                while (i < j && array[j] >= x)
                    j--;
                if (i < j)
                    array[i++] = array[j];

                while (i < j && array[i] < x)
                    i++;
                if (i < j)
                    array[j--] = array[i];
            }
            array[i] = x;

            //递归调用
            quick_sort(array, left, i - 1);
            quick_sort(array, i + 1, right);
        }
    }
}
