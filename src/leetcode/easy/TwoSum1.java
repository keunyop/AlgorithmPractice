package leetcode.easy;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/description/
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	Example 1:
	
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
	Example 1:
	
	Given nums = [2, 5, 5, 11], tartget = 10,
	
	Because nums[2] + nums[2] = 5 + 5 = 9,
	return [1, 2].
 *
 */
public class TwoSum1 {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return null;
    }
}
