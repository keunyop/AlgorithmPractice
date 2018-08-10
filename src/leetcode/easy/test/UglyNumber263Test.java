package leetcode.easy.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import leetcode.easy.UglyNumber263;

class UglyNumber263Test {

	@Test
	void testIsUgly() {
		UglyNumber263 uglyNum = new UglyNumber263();
		assertTrue(uglyNum.isUgly(1));
		assertTrue(uglyNum.isUgly(6));
		assertTrue(uglyNum.isUgly(8));
		assertFalse(uglyNum.isUgly(14));
	}
}