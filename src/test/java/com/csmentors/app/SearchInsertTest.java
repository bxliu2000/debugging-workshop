package com.csmentors.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SearchInsertTest
{
    int[] nums;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswer5()
    {
        nums = new int[]{1, 3, 5, 6};
        int target = 5;
        assertEquals(5, SearchInsert.searchInsert(nums, target));
    }

    @Test
    public void shouldAnswer1() {
        nums = new int[]{1, 3, 5, 6};
        int target = 2;
        assertEquals(1, SearchInsert.searchInsert(nums, target));
    }

    @Test
    public void shouldAnswer7() {
        nums = new int[]{1, 3, 5, 6};
        int target = 7;
        assertEquals(4, SearchInsert.searchInsert(nums, target));
    }
}
