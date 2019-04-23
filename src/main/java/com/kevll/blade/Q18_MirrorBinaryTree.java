package com.kevll.blade;

import com.sun.media.sound.MidiInDeviceProvider;

/**
 * @author: Kevin Zhang
 * @date: 2019/4/23
 */
public class Q18_MirrorBinaryTree {

    /**
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     * <p>
     * 二叉树的镜像定义：
     * <p>
     * 源二叉树
     * 8
     * /  \
     * 6   10
     * / \  / \
     * 5  7 9 11
     * <p>
     * 镜像二叉树
     * 8
     * /  \
     * 10   6
     * / \  / \
     * 11 9 7  5
     */

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }


    public static void Mirror(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);
    }


}
