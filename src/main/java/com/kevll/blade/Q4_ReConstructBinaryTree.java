package com.kevll.blade;

/**
 * @author: kevin
 * @date: 2018/6/8
 * @description:
 */
public class Q4_ReConstructBinaryTree {
    /**
     * 树    重建二叉树
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn)//当到达边界条件时候返回null
            return null;
        //新建一个TreeNode
        TreeNode root = new TreeNode(pre[startPre]);
        //对中序数组进行输入边界的遍历
        for (int i = startIn; i <= endIn; i++)
            if (in[i] == pre[startPre]) {
                //重构左子树，注意边界条件                  左子树前序遍历首尾索引                    左子树中序遍历首尾索引
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                //重构右子树，注意边界条件                    右子树前序遍历首尾索引                 右子树中序遍历首尾索引
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }

        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reConstructBinaryTree(pre, in);

        System.out.println("前序");
        printPre(node);
        System.out.println("\n中序");
        printIn(node);
        System.out.println("\n后序");
        printSuf(node);//74258631

    }

    //打印前序遍历
    static void printPre(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        printPre(node.left);
        printPre(node.right);
    }

    //打印中序遍历
    static void printIn(TreeNode node) {
        if (node == null)
            return;
        printIn(node.left);
        System.out.print(node.val + " ");
        printIn(node.right);
    }

    //打印后序遍历
    static void printSuf(TreeNode node) {
        if (node == null)
            return;
        printSuf(node.left);
        printSuf(node.right);
        System.out.print(node.val + " ");
    }
}
