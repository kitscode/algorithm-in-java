package com.kevll.blade;

import java.util.ArrayList;

/**
 * @author: kevin
 * @date: 2018/6/8
 * @description:
 */
public class Q3_PrintListFromTailToHead {
    /**
     * 链表   从尾到头打印链表
     * 输入一个链表，从尾到头打印链表每个节点的值。
     */


    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead_k(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        } else {
            list.add(listNode.val);
        }
        while (listNode.next != null) {
            list.add(listNode.next.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        //倒转数组
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        return list2;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(printListFromTailToHead_k(node1));
    }
}
