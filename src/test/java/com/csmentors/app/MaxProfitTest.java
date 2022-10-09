package com.csmentors.app;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class MaxProfitTest {

    // Instantiate solution class here.
    MaxProfit mp = new MaxProfit();

    // Instantiate problem input variables here.
    int[] prices;

    /**
     * Sanity check
     */
    @Test
    public void sanityOne()
    {
        // comment
        prices = new int[] { 7, 1, 5, 3, 6, 4 };
        assertTrue(mp.maxProfit(prices) == 5);
    }

    @Test
    public void sanityTwo()
    {
        prices = new int[] { 7, 6, 4, 3, 1};
        assertTrue(mp.maxProfit(prices) == 0);
    }

    @Test
    public void sanityThree()
    {
        prices = new int[] { 1 };
        assertTrue(mp.maxProfit(prices) == 0);
    }

}

