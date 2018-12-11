package com.kevll.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: kevin
 * @date: 2018/6/17
 * @description:
 */
public class BucketSort {


    /**
     * n个0-k范围间的数排序
     * 整个排序算法一共执行了2(n+k)次
     * 我们在说时间复杂度时候可以忽略较小的常数，最终桶排序的时间复杂度为O(n+k)。
     */
    public void bucketSort(int[] array) {
        int[] bucket = new int[22];
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        int j = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int k = bucket[i]; k > 0; k--) {
                array[j] = i;
                j++;
            }
        }
    }

    @Test
    public void test() {
        int[] array = {9, 1, 6, 7, 3, 12, 21, 13};
        bucketSort(array);
        System.out.println(Arrays.toString(array));
    }
}
