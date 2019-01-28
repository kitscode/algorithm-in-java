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
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        //list2 inserts into list1, record the return node
        ListNode returnNode = list1;

        while (list2.next != null) {    //loop through list2
            ListNode list2Next = list2.next;

            ListNode list1Pre = null;
            while (list1.next != null) {    //loop through list1
                if (list1.val > list2.val) {
                    list2.next = list1;
                    list1Pre.next = list2;
                    break;
                } else {
                    list1Pre = list1;
                    list1 = list1.next;
                }
            }
            if (list1.val > list2.val) {
                list2.next = list1;
                list1Pre.next = list2;
            }

            list1 = returnNode;     //recovery list1
            list2 = list2Next;      //list2 go to next
        }

        ListNode list1Pre = null;
        while (list1.next != null) {    //sort last 1 in list2
            if (list1.val > list2.val) {
                list2.next = list1;
                list1Pre.next = list2;
                break;
            } else {
                list1Pre = list1;
                list1 = list1.next;
            }
        }
        if (list1.val > list2.val) {
            list2.next = list1;
            list1Pre.next = list2;
        } else {
            list1.next = list2;
        }


        return returnNode;
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
        printNodeList(merge(node1, nodeA));
    }

    static void printNodeList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.print(head.val + " ");   //print the last one
    }
}
