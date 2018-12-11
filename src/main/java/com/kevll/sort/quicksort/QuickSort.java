package com.kevll.sort.quicksort;

import java.util.Arrays;

public class QuickSort {
    static int[] array = {6, 10, 12, 14, 3, 5, 23};

    public static void main(String[] s) {

        System.out.println("原数组==" + Arrays.toString(array));
        quick_sort(array, 0, array.length - 1);
        System.out.println("结果====" + Arrays.toString(array));
    }

    static void quick_sort(int s[], int l, int r) {
        if (l < r) {
            int i = adjustArray(s, l, r);//先用挖坑填数法调整s[]
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }

    static int adjustArray(int s[], int l, int r) { // 返回调整后基准数的位置

        int i = l, j = r;
        int x = s[i]; // s[i]就是第一个坑
        System.out.println("基准数=====" + x);
        while (i < j) {
            // 从右向左找小于x的数来填s[i]
            while (i < j && s[j] >= x)
                j--;
            if (i < j) {
                s[i] = s[j]; // 将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }
            System.out.println("先走j===" + Arrays.toString(array));
            // 从左向右找大于或等于x的数来填s[j]
            while (i < j && s[i] < x)
                i++;
            if (i < j) {
                s[j] = s[i]; // 将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
            System.out.println("再走i===" + Arrays.toString(array));
        }
        // 退出时，i等于j。将x填到这个坑中。
        s[i] = x;
        System.out.println("i j的索引：" + i + "---" + j);
        System.out.println(x + "==is ok" + Arrays.toString(array));
        return i;
    }
}
