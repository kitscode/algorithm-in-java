package com.kevll.sort;

import org.junit.Test;

import java.util.Arrays;


/**
 * @author: kevin
 * @date: 2018/6/16
 * @description:
 */
public class SelectionSort {
    /**
     * 第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成
     * <p>
     * 假设待排序的序列有 N 个元素，则比较次数永远都是N (N - 1) / 2。而移动次数与序列的初始排序有关。
     * 当序列正序时，移动次数最少，为 0。当序列反序时，移动次数最多，为3N (N - 1) /  2。
     * 所以，综上，简单排序的时间复杂度为 O(N2)。
     */

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j <= array.length - 1; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    @Test
    public void test() {
        int[] array = {9, 1, 6, 7, 3, 12, 21, 13};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
