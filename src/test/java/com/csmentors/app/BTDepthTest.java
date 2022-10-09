package com.csmentors.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BTDepthTest {
    BTDepth bt = new BTDepth();
    @Test
    public void sanityTest() {
		/*
		               3
		              / \
		             1   6
		                  \
		                   9
		 */

        BTDepth.TreeNode root = new BTDepth.TreeNode(3,
                new BTDepth.TreeNode(1),
                new BTDepth.TreeNode(6,
                        null,
                        new BTDepth.TreeNode(9)));

        int expected = 2;

        assertEquals(expected, bt.minDepth(root));
    }

    @Test
    public void shortTest() {
		/*
		            14
		           /  \
		          7   19
		         /   /  \
		        3   15  20
  		       /     \    \
		      2      17    22
		     /
		    1

		 */
        BTDepth.TreeNode root = new BTDepth.TreeNode(14,
                new BTDepth.TreeNode(7,
                        new BTDepth.TreeNode(3,
                                new BTDepth.TreeNode(2,
                                        new BTDepth.TreeNode(1),
                                        null),
                                null),
                        null),
                new BTDepth.TreeNode(19,
                        new BTDepth.TreeNode(15,
                                null,
                                new BTDepth.TreeNode(17)),
                        new BTDepth.TreeNode(20,
                                null,
                                new BTDepth.TreeNode(22))));

        int expected = 5;

        assertEquals(expected, bt.minDepth(root));
    }

    @Test public void emptyTest() {
        BTDepth.TreeNode root = new BTDepth.TreeNode();

        int expected = 0;

        assertEquals(expected, bt.minDepth(root));
    }

}
