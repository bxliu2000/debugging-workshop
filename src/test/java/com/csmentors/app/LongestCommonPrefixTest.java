package com.csmentors.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LongestCommonPrefixTest 
{
    LongestCommonPrefix lcp = new LongestCommonPrefix();
    
    String[] strs;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        strs = new String[3];
        Arrays.asList("flower","flow","flight").toArray(strs);
        assertEquals("fl", lcp.longestCommonPrefix(strs));
    }
}
