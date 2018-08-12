package leetcode.easy.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.MergeSortedArray88;

class MergeSortedArray88Test {

	@Test
	void testMerge() {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m=3, n=3;
		
		MergeSortedArray88 msa88 = new MergeSortedArray88();
		msa88.merge(nums1, m, nums2, n);
		
		assertArrayEquals(new int[] {1,2,2,3,5,6}, nums1);
	}
}