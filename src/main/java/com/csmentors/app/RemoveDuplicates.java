package com.csmentors.app;

/**
 * 
 *
 */


public class RemoveDuplicates {

	/** NUMS: the int[] from which duplicates will be removed
	 *  RETURN: returns the number of unique integers in the list
	 * */
	public int removeDuplicates(int[] nums) {
		int index = 1;
		int lastSeen = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > lastSeen) {
				nums[index] = nums[i - 1];
				lastSeen = nums[i - 1];
				index++;
			}
		}
		return index;
    }



}
