package com.kevll.blade;

import java.util.Stack;

/**
 * @author: Kevin Zhang
 * @date: 2018/10/12
 */
public class Q8_ReverseList {

    /**
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        Stack stack = new Stack();
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        stack.push(head);

        ListNode newHead = (ListNode) stack.peek();
        while (stack.size() != 0) {
            ListNode node = (ListNode) stack.pop();
            if (stack.size() != 0) {
                node.next = (ListNode) stack.peek();
            } else {
                node.next = null;
            }
        }
        return newHead;
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

        printNodeList(node1);
        System.out.println("\n---------reverse---------");
        printNodeList(reverseList(node1));
    }

    static void printNodeList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print(head.val + " ");
    }
}
