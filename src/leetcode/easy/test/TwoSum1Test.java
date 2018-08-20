package leetcode.easy.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.TwoSum1;

class TwoSum1Test {

	@Test
	void testTwoSum() {
		TwoSum1 twoSum = new TwoSum1();
		assertArrayEquals(new int[] {0, 1}, twoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
		assertArrayEquals(new int[] {1, 2}, twoSum.twoSum(new int[] {2, 5, 5, 11}, 10));
	}
}
	