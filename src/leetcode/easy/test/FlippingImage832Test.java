package leetcode.easy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcode.easy.FlippingImage832;

class FlippingImage832Test {

	@Test
	void testFlipAndInvertImage() {
		FlippingImage832 flipImg = new FlippingImage832();
		
		// Test 1
		int[][] input1 = new int[][] {{1,1,0}, {1,0,1}, {0,0,0}};
		int[][] expectedOutput1 = new int[][] {{1,0,0}, {0,1,0}, {1,1,1}};
		
		assertArrayEquals(expectedOutput1, flipImg.flipAndInvertImage(input1));
		
		// Test 2
		int[][] input2 = new int[][] {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
		int[][] expectedOutput2 = new int[][] {{1,1,0,0}, {0,1,1,0}, {0,0,0,1}, {1,0,1,0}};
		
		assertArrayEquals(expectedOutput2, flipImg.flipAndInvertImage(input2));
		
	}
}