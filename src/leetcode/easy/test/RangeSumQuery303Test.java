package leetcode.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.RangeSumQuery303;

class RangeSumQuery303Test {

    @Test
    void testSumRange() {
        RangeSumQuery303 rsq303 = new RangeSumQuery303(new int[] { -2, 0, 3, -5, 2, -1 });

        // Test 1
        assertEquals(1, rsq303.sumRange(0, 2));

        // Test 2
        assertEquals(-1, rsq303.sumRange(2, 5));

        // Test 3
        assertEquals(-3, rsq303.sumRange(0, 5));
    }

}