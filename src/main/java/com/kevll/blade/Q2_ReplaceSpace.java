package com.kevll.blade;

/**
 * @author: kevin
 * @date: 2018/6/8
 * @description:
 */
public class Q2_ReplaceSpace {
    /**
     * 字符串  替换空格
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
     */

    public static String replaceSpace_k(String str) {
        char[] s_char = str.toCharArray();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s_char.length; i++) {
            if (s_char[i] == ' ')
                result.append("%20");
            else
                result.append(s_char[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "We Are Happy";
        System.out.println(s);
        System.out.println(replaceSpace_k(s));
    }
}
