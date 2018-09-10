package leetcode.easy.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import leetcode.easy.ImplementStackUsingQueues225;

class ImplementStackUsingQueues225Test {

    @Test
    void testImplementStackUsingQueues225() {
        ImplementStackUsingQueues225 isuq225 = new ImplementStackUsingQueues225();
        isuq225.push(1);
        isuq225.push(2);

        assertEquals(2, isuq225.top());
        assertEquals(2, isuq225.pop());
        assertFalse(isuq225.empty());
    }
}
