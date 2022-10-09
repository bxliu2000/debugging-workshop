package com.csmentors.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class ReverseLinkedListTest {
    // Instantiate solution class here.
    ReverseLinkedList rll = new ReverseLinkedList();

    // Instantiate problem input variables here.
    ReverseLinkedList.ListNode listToReverse;
    ReverseLinkedList.ListNode idealOutput;

    /**
     * Sanity check
     */
    @Test
    public void sanityOne()
    {
        // start with our list 1 -> 2 -> 3
        listToReverse = new ReverseLinkedList.ListNode(1, new ReverseLinkedList.ListNode(2, new ReverseLinkedList.ListNode(3)));
        // our output of reverseList() should be: 3 -> 2 -> 1
        idealOutput = new ReverseLinkedList.ListNode(3, new ReverseLinkedList.ListNode(2, new ReverseLinkedList.ListNode(1)));
        // call reverseList(), might want to step in...
        listToReverse = rll.reverseList(listToReverse);
        // loop over lists and check their values at each node
        while(listToReverse.next != null || idealOutput.next != null) {
            assertTrue(listToReverse.val == idealOutput.val);
            listToReverse = listToReverse.next;
            idealOutput = idealOutput.next;
        }
    }

    @Test
    public void sanityTwo()
    {
        // start with our list 1 -> 2 -> 3 -> 4 -> 5
        listToReverse = new ReverseLinkedList.ListNode(1, new ReverseLinkedList.ListNode(2, new ReverseLinkedList.ListNode(3, new ReverseLinkedList.ListNode(4, new ReverseLinkedList.ListNode(5)))));
        idealOutput = new ReverseLinkedList.ListNode(5, new ReverseLinkedList.ListNode(4, new ReverseLinkedList.ListNode(3, new ReverseLinkedList.ListNode(2, new ReverseLinkedList.ListNode(1)))));

        listToReverse = rll.reverseList(listToReverse);

        while(listToReverse.next != null || idealOutput.next != null) {
            assertTrue(listToReverse.val == idealOutput.val);
            listToReverse = listToReverse.next;
            idealOutput = idealOutput.next;
        }
    }

    @Test
    public void sanityThree()
    {
        // start with our list 4
        listToReverse = new ReverseLinkedList.ListNode(4, null);
        idealOutput =  new ReverseLinkedList.ListNode(4, null);

        listToReverse = rll.reverseList(listToReverse);

        while(listToReverse.next != null || idealOutput.next != null) {
            assertTrue(listToReverse.val == idealOutput.val);
            listToReverse = listToReverse.next;
            idealOutput = idealOutput.next;
        }
    }
}
