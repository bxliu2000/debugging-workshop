package com.csmentors.app;

/**
 * Hello world!
 *
 */
public class TwoSum 
{
    public static void main( String[] args )
    {
        System.out.println( "Two Sum Test" );
    }

    public int[] twoSum(int[] nums, int target) {
        // TODO: Introduce bug here.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target + nums[i]) { // bug
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
