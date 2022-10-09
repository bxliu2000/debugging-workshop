package com.csmentors.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    RemoveDuplicates rd = new RemoveDuplicates();

    public void testRemove(int[] nums, int[] expectedNums) {
        int k = rd.removeDuplicates(nums); // Calls your implementation

        assertEquals(expectedNums.length, k);
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                assertEquals(expectedNums[i], nums[i]);
            }
        }
    }

    @Test
    public void sanityTest() {
        int[] nums = {1, 2};
        int[] expected = {1, 2};
        testRemove(nums, expected);
    }
    @Test
    public void longTest() {
        int[] nums = {1, 2, 2, 4, 4, 6, 7, 8, 9, 9, 9, 11, 14};
        int[] expected = {1, 2, 4, 6, 7, 8, 9, 11, 14};
        testRemove(nums, expected);
    }

    @Test
    public void emptyTest() {
        int[] nums = {};
        int[] expected = {};
        testRemove(nums, expected);
    }
}
