package com.csmentors.app;

class SameTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.right, q.left) && isSameTree(p.left, q.right);
        }
    }
}
