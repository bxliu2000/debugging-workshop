package com.csmentors.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SameTreeTest
{
    SameTree.TreeNode p;
    SameTree.TreeNode q;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        p = new SameTree.TreeNode(1);
        q = new SameTree.TreeNode(1);
        p.right = new SameTree.TreeNode(3);
        q.right = new SameTree.TreeNode(3);
        p.left = new SameTree.TreeNode(2);
        q.left = new SameTree.TreeNode(2);
        assertEquals(true, SameTree.isSameTree(p, q));
    }

    @Test
    public void shouldAnswerWithFalse1()
    {
        p = new SameTree.TreeNode(1);
        q = new SameTree.TreeNode(1);
        p.right = new SameTree.TreeNode(2);
        q.left = new SameTree.TreeNode(2);
        assertEquals(false, SameTree.isSameTree(p, q));
    }

    @Test
    public void shouldAnswerWithFalse2()
    {
        p = new SameTree.TreeNode(1);
        q = new SameTree.TreeNode(1);
        p.right = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        q.left = new SameTree.TreeNode(1);
        q.right = new SameTree.TreeNode(2);
        assertEquals(false, SameTree.isSameTree(p, q));
    }
}
