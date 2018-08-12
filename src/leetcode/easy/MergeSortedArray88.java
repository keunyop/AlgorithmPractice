package leetcode.easy;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/description/
 * 
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	
	Note:
	
	The number of elements initialized in nums1 and nums2 are m and n respectively.
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
	Example:
	
	Input:
	nums1 = [1,2,3,0,0,0], m = 3
	nums2 = [2,5,6],       n = 3
	
	Output: [1,2,2,3,5,6]
 * 
 */
public class MergeSortedArray88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=m;
        
        for (int j = 0; j < n; j++) {
        	nums1[t++] = nums2[j];
		}
        
        Arrays.sort(nums1);
		
		
		for (int i = 0; i < nums1.length-1; i++) {
			for (int j = 0; j < nums1.length-2; j++) {
				
				// Comparing array values
				if (nums1[j] > nums1[j+1]) {
					int temp = 0;
					temp = nums1[j];	// Storing value of array in temp variable
					
					nums1[j] = nums1[j+1];	// Swaping values
					nums1[j+1] = temp;	// now stroing temp value in array
				}
			}
		}
    }
}