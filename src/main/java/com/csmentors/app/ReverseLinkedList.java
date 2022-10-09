package com.csmentors.app;

public class ReverseLinkedList {
    public static void main( String[] args )
    {
        System.out.println( "ReverseLinkedList test" );
    }

    /**
     * NOT BUGGY
     * This is our definition of a ListNode
     */
    public static class ListNode {
        int val; // a list node's value
        ListNode next; // a pointer to the next ListNode
        // constructors
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode q = null;
        ListNode r = head;
        while (r != null) {
            p = q;
            q = r;
            r = q.next;
            q.next = p;
        }
        return q;
    }
}
