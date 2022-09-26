package com.csmentors.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TwoSumTest
{
    // Instantiate solution class here.
    TwoSum ts = new TwoSum();

    // Instantiate problem input variables here.
    int[] nums;
    int target;

    /**
     * Sanity check
     */
    @Test
    public void sanityOne()
    {
        nums = new int[] { 2, 7, 11, 15 };
        target = 9;
        assertArrayEquals(new int[] { 0, 1 }, ts.twoSum(nums, target));
    }

    @Test
    public void sanityTwo()
    {
        nums = new int[] { 3, 2, 4 };
        target = 6;
        assertArrayEquals(new int[] { 1, 2 }, ts.twoSum(nums, target));
    }

    @Test
    public void sanityThree()
    {
        nums = new int[] { 3, 3 };
        target = 6;
        assertArrayEquals(new int[] { 0, 1 }, ts.twoSum(nums, target));
    }

}
