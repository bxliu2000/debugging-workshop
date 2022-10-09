package com.csmentors.app;
/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
public class TwoSum 
{
    public static void main( String[] args )
    {
        System.out.println( "Two Sum Test" );
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i++; j < nums.length; j++) {
                if (nums[j] - nums[i] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
