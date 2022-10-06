package com.csmentors.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LongestPalindromicSubstringTest
{
    // Instantiate solution class here.
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

    // Instantiate problem input variables here.
    String input;
    Set<String> expected;

    /**
     * Sanity check
     */
    @Test
    public void sanityOne()
    {
        // comment
        input = "babad";
        expected = new HashSet<String>(Arrays.asList("bab", "aba"));
        assertTrue(expected.contains(lps.longestPalindrome(input)));
    }

}
