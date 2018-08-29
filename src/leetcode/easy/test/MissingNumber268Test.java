package leetcode.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.MissingNumber268;

class MissingNumber268Test {

    @Test
    void testMissingNumber() {
        MissingNumber268 mN268 = new MissingNumber268();

        // Test 1
        assertEquals(2, mN268.missingNumber(new int[] { 3, 0, 1 }));

        // Test 2
        assertEquals(8, mN268.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}
