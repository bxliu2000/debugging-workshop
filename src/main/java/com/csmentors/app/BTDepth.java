package com.csmentors.app;

/**
 * Hello world!
 *
 */
public class BTDepth {
	public int minDepth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return minDepth(root.right);
        } else if (root.right == null) {
            return minDepth(root.left);
        } else {
            return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
        }
    }



	/** TreeNode definition. */
	public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode() {}
		 TreeNode(int val) { this.val = val; }
		 TreeNode(int val, TreeNode left, TreeNode right) {
			 this.val = val;
			 this.left = left;
			 this.right = right;
		 }
	 }
}
