package leetcode.easy.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.RemoveDuplicates83;

class RemoveDuplicates83Test {

	@Test
	void testDeleteDuplicates() {
		RemoveDuplicates83 removeDup = new RemoveDuplicates83();
		assertArrayEquals(new int[] {1,2}, removeDup.deleteDuplicates(new int[] {1,1,2}));
		assertArrayEquals(new int[] {1,2,3}, removeDup.deleteDuplicates(new int[] {1,1,2,3,3}));
	}
}
