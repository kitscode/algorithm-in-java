package com.kevll.blade;

/**
 * @author: Kevin Zhang
 * @date: 2018/12/17
 */
public class Q16_MergeLinkedList {
    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     */
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = merge(list1.next, list2);
            return list1;
        }else{
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(11);
        ListNode node4 = new ListNode(21);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode nodeA = new ListNode(2);
        ListNode nodeB = new ListNode(4);
        ListNode nodeC = new ListNode(20);
        ListNode nodeD = new ListNode(32);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;


        printNodeList(node1);
        System.out.println();
        printNodeList(nodeA);
        System.out.println();
//        printNodeList(merge(node1, node2));
    }

    static void printNodeList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print(head.val + " ");
    }
}
