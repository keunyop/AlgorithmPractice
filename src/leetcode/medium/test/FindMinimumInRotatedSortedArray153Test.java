package leetcode.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import leetcode.medium.FindMinimumInRotatedSortedArray153;

class FindMinimumInRotatedSortedArray153Test {

    @Test
    void testFindMin() {
        FindMinimumInRotatedSortedArray153 f153 = new FindMinimumInRotatedSortedArray153();

        // Test 1
        assertEquals(1, f153.findMin(new int[] { 3, 4, 5, 1, 2 }));

        // Test 2
        assertEquals(0, f153.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));

        // Test 3
        assertEquals(0, f153.findMin(new int[] { 3, 4, 0, 1, 2 }));

        // Test 4
        assertEquals(0, f153.findMin(new int[] { 3, 4, 5, 0, 1, 2 }));

        // Test 5
        assertEquals(0, f153.findMin(new int[] { 4, 5, 6, 0, 7, 1, 2 }));
    }

}
