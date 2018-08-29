package leetcode.easy;

/**
 * 268.Missing Number
 * https://leetcode.com/problems/missing-number
 *
 *	Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

	Example 1:
	
	Input: [3,0,1]
	Output: 2
	
	Example 2:
	
	Input: [9,6,4,2,3,5,7,0,1]
	Output: 8
	
	Note:
	Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber268 {
    public int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length + 1; i++) {
            boolean findNumber = false;

            for (int n : nums) {
                if (n == i) {
                    findNumber = true;
                    break;
                }
            }

            if (!findNumber) {
                return i;
            }
        }

        return 0;
    }
}